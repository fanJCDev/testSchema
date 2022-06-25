package com.interview.blog.modules.posts.controller;

import com.interview.blog.modules.posts.model.Tag;
import com.interview.blog.modules.posts.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/tags")
public class TagController {

    private TagService tagService;

    @Autowired
    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String tags(Model model) {
        model.addAttribute("tags", tagService.findAllTags());
        return "tags/tags";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerPage(Model model) {
        model.addAttribute("tag", new Tag());
        return "tags/registerTags";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@ModelAttribute @Valid Tag tag, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "tags/registerTags";

        tagService.registerTag(tag);
        return "redirect:/tags";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editPage(Model model ,@PathVariable("id") Long id) {
        model.addAttribute("tag", tagService.findById(id));
        return "tags/registerTags";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String editPage(@PathVariable("id") Long id) {
        tagService.deleteById(id);
        return "redirect:/tags";
    }

    @RequestMapping(value = "/rest/getTags", method = RequestMethod.GET)
    public @ResponseBody
    List<Tag> getTags() {
        return tagService.findAllTags();
    }

    @RequestMapping(value = "/rest/register", method = RequestMethod.POST)
    public @ResponseBody
    Tag registerTag(@RequestBody Tag tag) {
        return tagService.registerTag(tag);
    }
}
