package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f52569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f52570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ u[] f52571d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final enum a extends u {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.u
        public j a(Long l10) {
            return l10 == null ? l.f52561b : new p(l10);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f52569b = aVar;
        u uVar = new u("STRING", 1) { // from class: com.google.gson.u.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.u
            public j a(Long l10) {
                return l10 == null ? l.f52561b : new p(l10.toString());
            }
        };
        f52570c = uVar;
        f52571d = new u[]{aVar, uVar};
    }

    public u(String str, int i10) {
        super(str, i10);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f52571d.clone();
    }

    public abstract j a(Long l10);

    public /* synthetic */ u(String str, int i10, a aVar) {
        this(str, i10);
    }
}
