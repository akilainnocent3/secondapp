package com.sportybet.android.instantwin.newtork.model.response;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class BetBuilderConfig {
    public boolean active;
    public String marketId;
    public List<BetBuilderMutexItem> marketMutexRule;
    public String marketType;
    public String maxOdds;
    private HashMap<String, List<Integer>> mutexMapping;
    public List<String> supportMarkets;

    private void createRefData() {
        synchronized (this) {
            try {
                if (this.mutexMapping != null) {
                    return;
                }
                this.mutexMapping = new HashMap<>();
                for (BetBuilderMutexItem betBuilderMutexItem : this.marketMutexRule) {
                    this.mutexMapping.put(betBuilderMutexItem.mutexKey, betBuilderMutexItem.indexArray);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public HashMap<String, List<Integer>> getMutexMapping() {
        createRefData();
        return this.mutexMapping;
    }

    public void setActive(boolean z) {
        this.active = z;
    }
}
