package com.example.controller;

import com.example.models.*;

import com.example.repository.*;
import com.example.service.AuctionListService;
import com.example.service.FreePontsService;
import com.example.service.PontsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Controller
public class FormController {


/*    @Autowired
        private AuctionFormRepository auctionFormRepository;
    @GetMapping("/auction")
    public String Auction(Model model){
        Iterable<AuctionForm> auction = auctionFormRepository.findAll();//массив данных из таблички
        model.addAttribute("auction", auction);
        return "auction";
    }*/



    @Autowired
       private NewsRepository newsRepository;
    @GetMapping("/news")
    public String NewsList(Model model){
        Iterable<News> news = newsRepository.findAll();//массив данных из таблички
        model.addAttribute("news", news);
        return "news";
    }
    @GetMapping("/news/{id}")
    public String NewsDetails(@PathVariable(value ="id") long news_id, Model model){
        Optional<News> news= newsRepository.findById(news_id);
        ArrayList<News> res = new ArrayList<>();
        news.ifPresent(res::add);
        model.addAttribute("news", res);
        return "newsDetails";
    }

    @Autowired
        private AuctionListRepository auctionListRepository;
    @GetMapping("/auction")
    public String  AuctionList(Model model){
        Iterable<AuctionList> auctionList = auctionListRepository.findAll();//массив данных из таблички
        model.addAttribute("auction", auctionList);
        return "auction";
    }
    @Autowired
    private PontsService pontsService;
  /*  private AuctionListService auctionListService;*/
    @GetMapping("/auction/{id}")
    public String AuctionDetails(@PathVariable(value ="id") long auction_id, Model model){
                if (auction_id ==2) {
               model.addAttribute("ponts", pontsService.getAllPonts());
           /*     model.addAttribute("auc",auctionListService.getAllAuctionList());*/
                }
                    else
                        model.addAttribute("ponts1",pontsService.getAllPonts());
                        /*model.addAttribute("auc1",auctionListService.getAllAuctionList());}*/
        return "open_auction";
    }



    @GetMapping("/auction/add-auct-participant/{id}")

    public String  AddAuctParticipant(@PathVariable(value ="id") long auction_id,Model model){
        if (auction_id ==2) {
        model.addAttribute("open_auction",pontsService.getAllPonts());}
        else
            model.addAttribute("open_auction1",pontsService.getAllPonts());
        return "add-auct-participant";

    }
    @Autowired
    private SearchRepository searchRepository;
       @PostMapping("search")
    public String find (@RequestParam String filter, Model model){
           List<FreePonts> pontslist1 = searchRepository.findFreePontsByAdressContaining(filter);
           List<Ponts> pontslist = searchRepository.findPontsByAdressContaining(filter);


            model.addAttribute("searchlist",pontslist);


            model.addAttribute("searchlist1",pontslist1);
         return "search";
    }




    @Autowired
    private PersonAucListRepository personAucListRepository;
    @PostMapping("/auction/add-auct-participant")
    public String  AddPartData(@RequestParam String fio,
                               @RequestParam String adress,
                               @RequestParam String passport,
                               @RequestParam Long Id_ponts,
                               @RequestParam String date,
                               @RequestParam String telephone,
                                Model model){
        PersonAucList personAucList = new PersonAucList(fio, adress, Id_ponts, passport,  date, telephone);
        personAucListRepository.save(personAucList);
        return "redirect:/auction";
    }

    /*@Autowired
    private FreePontsRepository freePontsRepository;
    @GetMapping("/freepont") //переход по адресу /freepont
    public String FreePontList(Model model){
        Iterable <FreePonts> freePont = freePontsRepository.findAll();//массив данных из таблички
        model.addAttribute("freepont", freePont);
        return "freepont"; // вызываемый шаблон freepont.html
    }*/
    @Autowired
    private FreePontsService freePontsService;
    @GetMapping ("/freepont")
    public String viewFreePonts(Model model){
        model.addAttribute("listFreePonts",freePontsService.getAllFreePonts());
        return "freepont";
    }




    @GetMapping("/freepont/freepont_form")
    public String  AddFreepontParticipant(Model model){
        Iterable <FreePonts> freePont = freePontsService.getAllFreePonts();//массив данных из таблички
        model.addAttribute("freepont", freePont);
        return "freepont_form";
    }
    @Autowired
    private FreePontsListRepository freePontsListRepository;
    @PostMapping("/freepont/freepont_form")
    public String  AddFreePontsData(@RequestParam String fio,
                               @RequestParam Long id_ponts,
                               @RequestParam String date,
                               @RequestParam String telephone,
                               Model model){
       PersonFreePont personFreePont = new PersonFreePont(id_ponts,fio,  date, telephone);
        freePontsListRepository.save(personFreePont);
        return "redirect:/freepont";
    }








}
