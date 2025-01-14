/*
*                                                                              *
*               ╔╗╔┌─┐┌┬┐┌─┐╔═╗┬  ┬┌─┐┬─┐┌─┐┬  ┌─┐┬ ┬                          *
*               ║║║│ │ │ └─┐║ ║└┐┌┘├┤ ├┬┘├┤ │  │ ││││                          *
*               ╝╚╝└─┘ ┴ └─┘╚═╝ └┘ └─┘┴└─└  ┴─┘└─┘└┴┘                          *
*                                                                              *
*               LanguageList.java created 2025/01/12                           *
*               by Richard JUAN (contact@richard-juan.com)                     *
*                                                                              *
*               Copyright © 2025 Richard JUAN. All rights reserved             *
*                                                                              *
*/

import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        if (this.languages.size() == 0)
            return true;
        return false;
    }

    public void addLanguage(String language) {
        if (!this.languages.contains(language))
            this.languages.add(language);
    }

    public void removeLanguage(String language) {
        if (this.languages.contains(language))
            this.languages.remove(language);
    }

    public String firstLanguage() {
        // not safe, should not be used if list is empty
        return this.languages.get(0);
    }

    public int count() {
        return this.languages.size();
    }

    public boolean containsLanguage(String language) {
        return this.languages.contains(language);
    }

    public boolean isExciting() {
        if (this.languages.contains("Java") || this.languages.contains("Kotlin"))
            return true;
        return false;
    }
}
