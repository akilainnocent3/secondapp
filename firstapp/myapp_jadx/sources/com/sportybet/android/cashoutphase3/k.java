package com.sportybet.android.cashoutphase3;

import com.sportybet.plugin.realsports.data.BetOrderType;

/* JADX INFO: loaded from: classes5.dex */
public abstract class k {

    public static final class a extends k {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -298532642;
        }

        public final String toString() {
            return BetOrderType.MULTIPLE;
        }
    }

    public static final class b extends k {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1738972922;
        }

        public final String toString() {
            return "None";
        }
    }

    public static final class c extends k {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -273089898;
        }

        public final String toString() {
            return "Single";
        }
    }
}
