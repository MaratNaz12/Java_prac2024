package com.example.javaprac.DAO;

import com.example.javaprac.models.ContactInfo;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

public interface ContactInfoDAO extends CommonDAO<ContactInfo, Long> {

    ContactInfo getSinglePersonByName(String personName);
    String getYearsOfLife(ContactInfo person);
    List<ContactInfo> getByFilter(Filter filter);

    @Builder
    @Getter
    class Filter {
        private String name;
    }

    static Filter.FilterBuilder getFilterBuilder() {
        return Filter.builder();
    }
}
