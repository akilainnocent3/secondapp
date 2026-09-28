package com.sportybet.feature.gift.giftreceived.presentation.giftreceived;

import defpackage.wqk;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface d {

    public static final class a implements d {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 461168309;
        }

        public final String toString() {
            return "ClickBetNow";
        }
    }

    public static final class b implements d {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1250424628;
        }

        public final String toString() {
            return "ClickHowToUse";
        }
    }

    public static final class c implements d {
        public final wqk a;

        public c(wqk wqkVar) {
            wqkVar.getClass();
            this.a = wqkVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SendEvent(event=" + this.a + ")";
        }
    }
}
