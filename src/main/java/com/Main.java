package com;

import generated.LibraryRequest;
import generated.LibraryResponse;

public class Main {
    public static void main(String[] args) {
        LibraryRequest libraryRequest = new LibraryRequest();
        libraryRequest.setName("Wiedzmin");
        LibraryPort portService = new LibraryPortService().getLibraryPortSoap11();
        LibraryResponse libraryResponse = portService.library(libraryRequest);
        System.out.println(libraryResponse.getBook().getAuthor());
    }
}
