package defpackage;

import com.sporty.android.core.model.account.AvatarFrame;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class uo1 implements crm {
    public final m2l a;
    public final vxt b;
    public final odd c;
    public final bnh0 d;

    @c0d(c = "com.sporty.android.platform.features.loyalty.AvatarUseCase$clear$1", f = "AvatarUseCase.kt", l = {109, 110, 111, 112, 113, 114}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return uo1.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x005a  */
        /* JADX WARN: Code duplicated, block: B:21:0x0068  */
        /* JADX WARN: Code duplicated, block: B:24:0x0078  */
        /* JADX WARN: Code duplicated, block: B:27:0x0086  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
        
            if (r1.a.putString("key_avatar_frame_lage", "", r7) == r2) goto L29;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                uo1 r0 = defpackage.uo1.this
                m2l r1 = r0.a
                y5b r2 = defpackage.y5b.a
                int r3 = r7.a
                r4 = -1
                java.lang.String r5 = ""
                switch(r3) {
                    case 0: goto L2f;
                    case 1: goto L2b;
                    case 2: goto L27;
                    case 3: goto L23;
                    case 4: goto L1f;
                    case 5: goto L1a;
                    case 6: goto L15;
                    default: goto Le;
                }
            Le:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                r7 = 0
                return r7
            L15:
                defpackage.uj50.b(r8)
                goto L94
            L1a:
                defpackage.uj50.b(r8)
                goto L86
            L1f:
                defpackage.uj50.b(r8)
                goto L78
            L23:
                defpackage.uj50.b(r8)
                goto L68
            L27:
                defpackage.uj50.b(r8)
                goto L5a
            L2b:
                defpackage.uj50.b(r8)
                goto L45
            L2f:
                defpackage.uj50.b(r8)
                java.lang.Integer r8 = new java.lang.Integer
                r8.<init>(r4)
                r3 = 1
                r7.a = r3
                zed r3 = r1.a
                java.lang.String r6 = "key_loyalty_highest_tier"
                java.lang.Object r8 = r3.putInt(r6, r8, r7)
                if (r8 != r2) goto L45
                goto L93
            L45:
                vxt r8 = r0.b
                wm20 r8 = r8.a()
                java.lang.Integer r0 = new java.lang.Integer
                r0.<init>(r4)
                r3 = 2
                r7.a = r3
                java.lang.Object r8 = r8.g(r7, r0)
                if (r8 != r2) goto L5a
                goto L93
            L5a:
                r8 = 3
                r7.a = r8
                zed r8 = r1.a
                java.lang.String r0 = "key_avatar_url"
                java.lang.Object r8 = r8.putString(r0, r5, r7)
                if (r8 != r2) goto L68
                goto L93
            L68:
                java.lang.Boolean r8 = java.lang.Boolean.FALSE
                r0 = 4
                r7.a = r0
                zed r0 = r1.a
                java.lang.String r3 = "key_avatar_frame_applied"
                java.lang.Object r8 = r0.putBoolean(r3, r8, r7)
                if (r8 != r2) goto L78
                goto L93
            L78:
                r8 = 5
                r7.a = r8
                zed r8 = r1.a
                java.lang.String r0 = "key_avatar_frame_small"
                java.lang.Object r8 = r8.putString(r0, r5, r7)
                if (r8 != r2) goto L86
                goto L93
            L86:
                r8 = 6
                r7.a = r8
                zed r8 = r1.a
                java.lang.String r0 = "key_avatar_frame_lage"
                java.lang.Object r7 = r8.putString(r0, r5, r7)
                if (r7 != r2) goto L94
            L93:
                return r2
            L94:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: uo1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.platform.features.loyalty.AvatarUseCase$saveAvatarSync$1", f = "AvatarUseCase.kt", l = {HttpStatusCodesKt.HTTP_EARLY_HINTS}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ AvatarFrame d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, AvatarFrame avatarFrame, int i, int i2, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = str;
            this.d = avatarFrame;
            this.e = i;
            this.f = i2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return uo1.this.new b(this.c, this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                Integer num = new Integer(this.e);
                Integer num2 = new Integer(this.f);
                this.a = 1;
                if (uo1.this.b(this.c, this.d, num, num2, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public uo1(m2l m2lVar, vxt vxtVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, bnh0 bnh0Var) {
        m2lVar.getClass();
        bnh0Var.getClass();
        this.a = m2lVar;
        this.b = vxtVar;
        this.c = oddVar;
        this.d = bnh0Var;
    }

    @Override // defpackage.crm
    public final void a(String str, AvatarFrame avatarFrame, int i, int i2) {
        str.getClass();
        avatarFrame.getClass();
        zu7.a aVar = zu7.a;
        ej5.c(zu7.b(null), this.c, null, new b(str, avatarFrame, i, i2, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0094 A[Catch: all -> 0x0135, TryCatch #0 {all -> 0x0135, blocks: (B:12:0x002b, B:63:0x0130, B:15:0x0034, B:56:0x0110, B:60:0x011c, B:18:0x003d, B:50:0x00f1, B:53:0x00fc, B:21:0x0046, B:47:0x00cb, B:24:0x0051, B:44:0x00b3, B:27:0x005d, B:37:0x008c, B:39:0x0094, B:40:0x0098, B:30:0x0064, B:32:0x006c, B:34:0x0072), top: B:68:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cb A[Catch: all -> 0x0135, PHI: r8 r9
      0x00cb: PHI (r8v7 'this' uo1) = (r8v5 'this' uo1), (r8v8 'this' uo1) binds: [B:45:0x00c8, B:21:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x00cb: PHI (r9v6 com.sporty.android.core.model.account.AvatarFrame) = (r9v4 com.sporty.android.core.model.account.AvatarFrame), (r9v7 com.sporty.android.core.model.account.AvatarFrame) binds: [B:45:0x00c8, B:21:0x0046] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0135, blocks: (B:12:0x002b, B:63:0x0130, B:15:0x0034, B:56:0x0110, B:60:0x011c, B:18:0x003d, B:50:0x00f1, B:53:0x00fc, B:21:0x0046, B:47:0x00cb, B:24:0x0051, B:44:0x00b3, B:27:0x005d, B:37:0x008c, B:39:0x0094, B:40:0x0098, B:30:0x0064, B:32:0x006c, B:34:0x0072), top: B:68:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f1 A[Catch: all -> 0x0135, PHI: r8 r9
      0x00f1: PHI (r8v9 'this' uo1) = (r8v7 'this' uo1), (r8v10 'this' uo1) binds: [B:48:0x00ee, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r9v8 com.sporty.android.core.model.account.AvatarFrame) = (r9v6 com.sporty.android.core.model.account.AvatarFrame), (r9v9 com.sporty.android.core.model.account.AvatarFrame) binds: [B:48:0x00ee, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0135, blocks: (B:12:0x002b, B:63:0x0130, B:15:0x0034, B:56:0x0110, B:60:0x011c, B:18:0x003d, B:50:0x00f1, B:53:0x00fc, B:21:0x0046, B:47:0x00cb, B:24:0x0051, B:44:0x00b3, B:27:0x005d, B:37:0x008c, B:39:0x0094, B:40:0x0098, B:30:0x0064, B:32:0x006c, B:34:0x0072), top: B:68:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:55:0x010f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0110 A[Catch: all -> 0x0135, PHI: r8 r9
      0x0110: PHI (r8v11 'this' uo1) = (r8v9 'this' uo1), (r8v15 'this' uo1) binds: [B:54:0x010d, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0110: PHI (r9v10 com.sporty.android.core.model.account.AvatarFrame) = (r9v8 com.sporty.android.core.model.account.AvatarFrame), (r9v13 com.sporty.android.core.model.account.AvatarFrame) binds: [B:54:0x010d, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0135, blocks: (B:12:0x002b, B:63:0x0130, B:15:0x0034, B:56:0x0110, B:60:0x011c, B:18:0x003d, B:50:0x00f1, B:53:0x00fc, B:21:0x0046, B:47:0x00cb, B:24:0x0051, B:44:0x00b3, B:27:0x005d, B:37:0x008c, B:39:0x0094, B:40:0x0098, B:30:0x0064, B:32:0x006c, B:34:0x0072), top: B:68:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x011a  */
    /* JADX WARN: Code duplicated, block: B:59:0x011b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012d, code lost:
    
        if (r8.a.putString("key_avatar_frame_lage", r3, r0) == r1) goto L62;
     */
    @Override // defpackage.crm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r9, com.sporty.android.core.model.account.AvatarFrame r10, java.lang.Integer r11, java.lang.Integer r12, defpackage.x1b r13) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uo1.b(java.lang.String, com.sporty.android.core.model.account.AvatarFrame, java.lang.Integer, java.lang.Integer, x1b):java.lang.Object");
    }

    public final l1i c() {
        to1 to1Var = to1.a;
        m2l m2lVar = this.a;
        return r1i.b(m2lVar.getStringByFlow("key_avatar_url", ""), m2lVar.a.getBooleanByFlow("key_avatar_frame_applied", true), m2lVar.getStringByFlow("key_avatar_frame_lage", ""), m2lVar.getStringByFlow("key_avatar_frame_small", ""), new vo1(this, null));
    }

    @Override // defpackage.crm
    public final void clear() {
        zu7.a aVar = zu7.a;
        ej5.c(zu7.b(null), this.c, null, new a(null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum d(x1b x1bVar) {
        wo1 wo1Var;
        if (x1bVar instanceof wo1) {
            wo1Var = (wo1) x1bVar;
            int i = wo1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wo1Var.c = i - Integer.MIN_VALUE;
            } else {
                wo1Var = new wo1(this, x1bVar);
            }
        } else {
            wo1Var = new wo1(this, x1bVar);
        }
        Object obj = wo1Var.a;
        y5b y5bVar = y5b.a;
        int i2 = wo1Var.c;
        Object obj2 = null;
        if (i2 == 0) {
            uj50.b(obj);
            wo1Var.c = 1;
            obj = this.a.a.getInt("key_loyalty_highest_tier", -1, wo1Var);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        int iIntValue = ((Number) obj).intValue();
        uag uagVar = krf0.I;
        q3.b bVarA = ocx.a(uagVar, uagVar);
        while (bVarA.hasNext()) {
            Object next = bVarA.next();
            if (((krf0) next).a == iIntValue) {
                obj2 = next;
                break;
            }
        }
        return (krf0) obj2;
    }
}
