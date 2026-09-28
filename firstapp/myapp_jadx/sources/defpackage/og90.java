package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class og90 implements dzm {
    public final en20 a;
    public final k5b b;
    public final b5 c;
    public final yzm d;
    public final lyh<Boolean> e;
    public final lyh<Boolean> f;

    public og90(en20 en20Var, k5b k5bVar, b5 b5Var, yzm yzmVar) {
        en20Var.getClass();
        k5bVar.getClass();
        b5Var.getClass();
        yzmVar.getClass();
        this.a = en20Var;
        this.b = k5bVar;
        this.c = b5Var;
        this.d = yzmVar;
        this.e = ozh.c(en20Var.getBooleanByFlow("key-piggy-bash-music", true), k5bVar);
        this.f = ozh.c(en20Var.getBooleanByFlow("key-piggy-bash-sound", true), k5bVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077 A[PHI: r7
      0x0077: PHI (r7v7 boolean) = (r7v6 boolean), (r7v6 boolean), (r7v8 boolean) binds: [B:24:0x0067, B:26:0x0074, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5 A[PHI: r7
      0x00b5: PHI (r7v10 boolean) = (r7v9 boolean), (r7v9 boolean), (r7v11 boolean) binds: [B:39:0x00a5, B:41:0x00b2, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        if (defpackage.ej5.d(r3, r8, r0) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
    
        if (defpackage.ej5.d(r3, r8, r0) == r1) goto L45;
     */
    @Override // defpackage.dzm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, defpackage.x1b r8) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og90.a(java.lang.String, x1b):java.lang.Object");
    }

    @Override // defpackage.dzm
    public final String b() {
        String userImage = this.c.getUserImage();
        return userImage == null ? "" : userImage;
    }

    @Override // defpackage.dzm
    public final lyh<Boolean> c() {
        return this.e;
    }

    @Override // defpackage.dzm
    public final String d() {
        String nickName = this.c.getNickName();
        return nickName == null ? "" : nickName;
    }

    @Override // defpackage.dzm
    public final lyh<Boolean> e() {
        return this.f;
    }
}
