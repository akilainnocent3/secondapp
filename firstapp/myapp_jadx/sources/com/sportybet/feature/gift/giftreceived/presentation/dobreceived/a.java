package com.sportybet.feature.gift.giftreceived.presentation.dobreceived;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public interface a {

    /* JADX INFO: renamed from: com.sportybet.feature.gift.giftreceived.presentation.dobreceived.a$a, reason: collision with other inner class name */
    public static final class C0367a implements a {
        public final ArrayList a;

        public C0367a(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0367a) && this.a.equals(((C0367a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NavigateToBettingProduct(categoryIds=" + this.a + ")";
        }
    }

    public static final class b implements a {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1223386162;
        }

        public final String toString() {
            return "NavigateToGameLobby";
        }
    }

    public static final class c implements a {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1616907170;
        }

        public final String toString() {
            return "NavigateToSport";
        }
    }
}
