package com.sportybet.feature.kyc.confirmAccountInfo;

import defpackage.fsa;
import defpackage.tug;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.sportybet.feature.kyc.confirmAccountInfo.a$a, reason: collision with other inner class name */
    public static final class C0376a extends a {
        public final fsa a;

        public C0376a(fsa fsaVar) {
            fsaVar.getClass();
            this.a = fsaVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0376a) && Intrinsics.g(this.a, ((C0376a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AccountInfoConfirmed(state=" + this.a + ")";
        }
    }

    public static final class b extends a {
        public static final b a = new b();
    }

    public static final class c extends a {
        public static final c a = new c();
    }

    public static final class d extends a {
        public static final d a = new d();
    }

    public static final class e extends a {
        public final String a;

        public e(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.g(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("ShowNameUpdateByNINDialog(name=", this.a, ")");
        }
    }

    public static final class f extends a {
        public static final f a = new f();
    }
}
