package com.interview.blog.modules.posts.service;

import com.interview.blog.modules.posts.model.Tag;
import com.interview.blog.modules.posts.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TagService {

    private TagRepository tagRepository;

    @Autowired
    public TagService(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    @Transactional
    public Tag registerTag(Tag tag) {
        return this.tagRepository.save(tag);
    }

    public List<Tag> findAllTags() {
        return this.tagRepository.findAll();
    }

    public Tag findById(Long id) {
        return tagRepository.getOne(id);
    }

    @Transactional
    public void deleteById(Long id) {
        tagRepository.deleteById(id);
    }
}
