package com.sklard.lab.soundwich.com.sklard.lab.soundwich.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.Required;

/**
 * Created by sklard on 11/12/15.
 */
public class Project extends RealmObject {
    @Required
    private String name;

    private RealmList<SoundBite> bites;
}

