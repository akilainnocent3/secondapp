package de;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f78956a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r f78957a;

        @Override // de.s.a
        public s a() {
            return new i(this.f78957a);
        }

        @Override // de.s.a
        public s.a b(@Nullable r rVar) {
            this.f78957a = rVar;
            return this;
        }
    }

    @Override // de.s
    @Nullable
    public r b() {
        return this.f78956a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        r rVar = this.f78956a;
        r rVarB = ((s) obj).b();
        if (rVar == null) {
            return rVarB == null;
        }
        return rVar.equals(rVarB);
    }

    public int hashCode() {
        r rVar = this.f78956a;
        return (rVar == null ? 0 : rVar.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f78956a + "}";
    }

    public i(@Nullable r rVar) {
        this.f78956a = rVar;
    }
}
