package com.sporty.android.core.model.patron;

import com.sporty.android.core.model.account.MyFavoriteStake;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class FavoriteSummary {
    public List<FavoriteMarket> markets;
    public FavoriteOddsRange oddsRange;
    private HashMap<String, FavoriteSport> sportRefMapping;
    public List<FavoriteSport> sports;
    public MyFavoriteStake stake;
    private HashMap<String, FavoriteTeam> teamRefMapping;
    private HashMap<String, FavoriteTournament> tournamentRefMapping;

    private void createRefData() {
        synchronized (this) {
            try {
                if (this.sportRefMapping != null) {
                    return;
                }
                this.sportRefMapping = new LinkedHashMap();
                this.tournamentRefMapping = new LinkedHashMap();
                this.teamRefMapping = new LinkedHashMap();
                List<FavoriteSport> list = this.sports;
                if (list != null) {
                    for (FavoriteSport favoriteSport : list) {
                        this.sportRefMapping.put(favoriteSport.id, favoriteSport);
                        List<FavoriteTournament> list2 = favoriteSport.tournaments;
                        if (list2 != null && list2.size() > 0) {
                            for (FavoriteTournament favoriteTournament : favoriteSport.tournaments) {
                                this.tournamentRefMapping.put(favoriteTournament.id, favoriteTournament);
                                List<FavoriteTeam> list3 = favoriteTournament.competitors;
                                if (list3 != null && list3.size() > 0) {
                                    for (FavoriteTeam favoriteTeam : favoriteTournament.competitors) {
                                        this.teamRefMapping.put(favoriteTeam.id, favoriteTeam);
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public HashMap<String, FavoriteSport> getSportRefMapping() {
        createRefData();
        return this.sportRefMapping;
    }

    public HashMap<String, FavoriteTeam> getTeamRefMapping() {
        createRefData();
        return this.teamRefMapping;
    }

    public HashMap<String, FavoriteTournament> getTournamentRefMapping() {
        createRefData();
        return this.tournamentRefMapping;
    }
}
