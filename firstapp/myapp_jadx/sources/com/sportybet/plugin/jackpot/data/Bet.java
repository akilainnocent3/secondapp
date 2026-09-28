package com.sportybet.plugin.jackpot.data;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class Bet {
    public String betType;
    public String bonus;
    public int combinationNum;
    public int eventStatus;
    public String flag;
    public String id;
    public String orderType;
    public String originStake;
    public String potentialWinnings;
    public List<SelectionDesc> selectionDescs;
    public String stake;
    public int status;
    public String winnings;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.id.equals(((Bet) obj).id);
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public boolean isLive() {
        List<SelectionDesc> list = this.selectionDescs;
        if (list == null) {
            return false;
        }
        Iterator<SelectionDesc> it = list.iterator();
        while (it.hasNext()) {
            int i = it.next().eventStatus;
            if (i == 1 || i == 2) {
                return true;
            }
        }
        return false;
    }
}
