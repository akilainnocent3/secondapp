package com.unity3d.services.ads.gmascar.managers;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public enum ScarBiddingManagerType {
    DISABLED("dis"),
    EAGER("eag");

    private final String name;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Constants {
        private static final String DIS = "dis";
        private static final String EAG = "eag";

        private Constants() {
        }
    }

    ScarBiddingManagerType(String str) {
        this.name = str;
    }

    public static ScarBiddingManagerType fromName(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == 99470) {
            str.equals("dis");
        } else if (iHashCode == 100171 && str.equals("eag")) {
            return EAGER;
        }
        return DISABLED;
    }

    public String getName() {
        return this.name;
    }
}
