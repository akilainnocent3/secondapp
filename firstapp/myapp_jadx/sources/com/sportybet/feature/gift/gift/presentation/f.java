package com.sportybet.feature.gift.gift.presentation;

import com.appsflyer.internal.p;
import defpackage.zsk;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface f {

    public static final class a implements f {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 242637828;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class b implements f {
        public final List<zsk> a;

        public b(List<zsk> list) {
            list.getClass();
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return p.a("Success(sections=", ")", this.a);
        }
    }
}
