package pe.edu.upao.martes.repositories.interfaces;

import pe.edu.upao.martes.models.Community;

import java.util.ArrayList;

public interface ICommunityRepository {
    ArrayList<Community> list();

    Community save(Community community);
}
