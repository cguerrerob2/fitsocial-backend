package pe.edu.upao.martes.repositories.array;

import pe.edu.upao.martes.models.Community;
import pe.edu.upao.martes.repositories.interfaces.ICommunityRepository;

import java.util.ArrayList;

public class CommunityRepositoryArray implements ICommunityRepository {

    private static ArrayList<Community> communityList = new ArrayList<>();

    @Override
    public ArrayList<Community> list() {
        return communityList;
    }

    @Override
    public Community save(Community community) {
        communityList.add(community);
        return community;
    }
}
