package com.sportybet.feature.luckynumber.winningpopup.presentation;

import defpackage.l5u;
import defpackage.lcr;

/* JADX INFO: loaded from: classes6.dex */
public interface b {

    public static final class a implements b {
        public final l5u a;

        public a(l5u l5uVar) {
            this.a = l5uVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NavigateToLuckyNumber(entry=" + this.a + ")";
        }
    }

    /* JADX INFO: renamed from: com.sportybet.feature.luckynumber.winningpopup.presentation.b$b, reason: collision with other inner class name */
    public static final class C0412b implements b {
        public final lcr a;

        public C0412b(lcr lcrVar) {
            this.a = lcrVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0412b) && this.a.equals(((C0412b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NavigateToScreen(screen=" + this.a + ")";
        }
    }

    public static final class c implements b {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1643290156;
        }

        public final String toString() {
            return "PopBackStack";
        }
    }
}
