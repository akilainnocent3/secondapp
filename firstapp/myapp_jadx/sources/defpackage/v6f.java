package defpackage;

import java.io.File;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class v6f implements lyh<zi50<? extends File>> {
    public final /* synthetic */ gzh a;
    public final /* synthetic */ w6f b;

    @c0d(c = "com.sportybet.feature.winning.domain.usecase.DownloadWinningPopupSoundUseCase$invoke$$inlined$map$1", f = "DownloadWinningPopupSoundUseCase.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return v6f.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ w6f b;

        @c0d(c = "com.sportybet.feature.winning.domain.usecase.DownloadWinningPopupSoundUseCase$invoke$$inlined$map$1$2", f = "DownloadWinningPopupSoundUseCase.kt", l = {52, 111, 50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;
            public myh d;
            public w6f e;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(myh myhVar, w6f w6fVar) {
            this.a = myhVar;
            this.b = w6fVar;
        }

        /* JADX WARN: Code duplicated, block: B:108:0x0167  */
        /* JADX WARN: Code duplicated, block: B:111:0x0175 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:17:0x003c, B:123:0x01c1, B:124:0x01c7, B:33:0x0081, B:35:0x0087, B:38:0x008d, B:40:0x0093, B:42:0x009b, B:44:0x00a1, B:46:0x00b3, B:48:0x00b7, B:51:0x00bc, B:109:0x0169, B:111:0x0175, B:112:0x0184, B:114:0x018a, B:116:0x0190, B:117:0x019d, B:119:0x01a3, B:120:0x01b2, B:52:0x00c0, B:54:0x00c4, B:56:0x00cc, B:58:0x00d8, B:60:0x00dc, B:63:0x00e1, B:65:0x00e5, B:66:0x00eb, B:68:0x00f7, B:70:0x00fb, B:73:0x0100, B:75:0x0104, B:76:0x010a, B:78:0x0116, B:80:0x011a, B:83:0x011f, B:85:0x0123, B:86:0x0129, B:88:0x0135, B:90:0x0139, B:93:0x013f, B:95:0x0143, B:96:0x0149, B:99:0x0155, B:103:0x015e), top: B:142:0x0027 }] */
        /* JADX WARN: Code duplicated, block: B:112:0x0184 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:17:0x003c, B:123:0x01c1, B:124:0x01c7, B:33:0x0081, B:35:0x0087, B:38:0x008d, B:40:0x0093, B:42:0x009b, B:44:0x00a1, B:46:0x00b3, B:48:0x00b7, B:51:0x00bc, B:109:0x0169, B:111:0x0175, B:112:0x0184, B:114:0x018a, B:116:0x0190, B:117:0x019d, B:119:0x01a3, B:120:0x01b2, B:52:0x00c0, B:54:0x00c4, B:56:0x00cc, B:58:0x00d8, B:60:0x00dc, B:63:0x00e1, B:65:0x00e5, B:66:0x00eb, B:68:0x00f7, B:70:0x00fb, B:73:0x0100, B:75:0x0104, B:76:0x010a, B:78:0x0116, B:80:0x011a, B:83:0x011f, B:85:0x0123, B:86:0x0129, B:88:0x0135, B:90:0x0139, B:93:0x013f, B:95:0x0143, B:96:0x0149, B:99:0x0155, B:103:0x015e), top: B:142:0x0027 }] */
        /* JADX WARN: Code duplicated, block: B:119:0x01a3 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:17:0x003c, B:123:0x01c1, B:124:0x01c7, B:33:0x0081, B:35:0x0087, B:38:0x008d, B:40:0x0093, B:42:0x009b, B:44:0x00a1, B:46:0x00b3, B:48:0x00b7, B:51:0x00bc, B:109:0x0169, B:111:0x0175, B:112:0x0184, B:114:0x018a, B:116:0x0190, B:117:0x019d, B:119:0x01a3, B:120:0x01b2, B:52:0x00c0, B:54:0x00c4, B:56:0x00cc, B:58:0x00d8, B:60:0x00dc, B:63:0x00e1, B:65:0x00e5, B:66:0x00eb, B:68:0x00f7, B:70:0x00fb, B:73:0x0100, B:75:0x0104, B:76:0x010a, B:78:0x0116, B:80:0x011a, B:83:0x011f, B:85:0x0123, B:86:0x0129, B:88:0x0135, B:90:0x0139, B:93:0x013f, B:95:0x0143, B:96:0x0149, B:99:0x0155, B:103:0x015e), top: B:142:0x0027 }] */
        /* JADX WARN: Code duplicated, block: B:122:0x01c0  */
        /* JADX WARN: Code duplicated, block: B:123:0x01c1 A[Catch: all -> 0x0045, PHI: r12 r13
          0x01c1: PHI (r12v12 myh) = (r12v19 myh), (r12v20 myh) binds: [B:121:0x01be, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
          0x01c1: PHI (r13v20 java.lang.Object) = (r13v16 java.lang.Object), (r13v24 java.lang.Object) binds: [B:121:0x01be, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0045, blocks: (B:17:0x003c, B:123:0x01c1, B:124:0x01c7, B:33:0x0081, B:35:0x0087, B:38:0x008d, B:40:0x0093, B:42:0x009b, B:44:0x00a1, B:46:0x00b3, B:48:0x00b7, B:51:0x00bc, B:109:0x0169, B:111:0x0175, B:112:0x0184, B:114:0x018a, B:116:0x0190, B:117:0x019d, B:119:0x01a3, B:120:0x01b2, B:52:0x00c0, B:54:0x00c4, B:56:0x00cc, B:58:0x00d8, B:60:0x00dc, B:63:0x00e1, B:65:0x00e5, B:66:0x00eb, B:68:0x00f7, B:70:0x00fb, B:73:0x0100, B:75:0x0104, B:76:0x010a, B:78:0x0116, B:80:0x011a, B:83:0x011f, B:85:0x0123, B:86:0x0129, B:88:0x0135, B:90:0x0139, B:93:0x013f, B:95:0x0143, B:96:0x0149, B:99:0x0155, B:103:0x015e), top: B:142:0x0027 }] */
        /* JADX WARN: Code duplicated, block: B:134:0x01de  */
        /* JADX WARN: Code duplicated, block: B:35:0x0087 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:17:0x003c, B:123:0x01c1, B:124:0x01c7, B:33:0x0081, B:35:0x0087, B:38:0x008d, B:40:0x0093, B:42:0x009b, B:44:0x00a1, B:46:0x00b3, B:48:0x00b7, B:51:0x00bc, B:109:0x0169, B:111:0x0175, B:112:0x0184, B:114:0x018a, B:116:0x0190, B:117:0x019d, B:119:0x01a3, B:120:0x01b2, B:52:0x00c0, B:54:0x00c4, B:56:0x00cc, B:58:0x00d8, B:60:0x00dc, B:63:0x00e1, B:65:0x00e5, B:66:0x00eb, B:68:0x00f7, B:70:0x00fb, B:73:0x0100, B:75:0x0104, B:76:0x010a, B:78:0x0116, B:80:0x011a, B:83:0x011f, B:85:0x0123, B:86:0x0129, B:88:0x0135, B:90:0x0139, B:93:0x013f, B:95:0x0143, B:96:0x0149, B:99:0x0155, B:103:0x015e), top: B:142:0x0027 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x008a  */
        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        /* JADX WARN: Code restructure failed: missing block: B:136:0x01f9, code lost:
        
            if (r12.emit(r13, r1) == r2) goto L137;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0, types: [v6f$b, v6f$b<T>] */
        /* JADX WARN: Type inference failed for: r12v1 */
        /* JADX WARN: Type inference failed for: r12v11 */
        /* JADX WARN: Type inference failed for: r12v15 */
        /* JADX WARN: Type inference failed for: r12v2 */
        /* JADX WARN: Type inference failed for: r12v21 */
        /* JADX WARN: Type inference failed for: r12v22 */
        /* JADX WARN: Type inference failed for: r12v23 */
        /* JADX WARN: Type inference failed for: r12v24 */
        /* JADX WARN: Type inference failed for: r12v25 */
        /* JADX WARN: Type inference failed for: r12v3, types: [myh] */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.myh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r13, defpackage.v1b r14) {
            /*
                Method dump skipped, instruction units count: 511
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: v6f.b.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    public v6f(gzh gzhVar, w6f w6fVar) {
        this.a = gzhVar;
        this.b = w6fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super zi50<? extends File>> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            b bVar = new b(myhVar, this.b);
            aVar.b = 1;
            if (this.a.collect(bVar, aVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
