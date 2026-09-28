package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.feature.gift.gift.presentation.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class jrk implements brk {
    public final tnn a;
    public final ldt b;
    public final k5b c;

    @c0d(c = "com.sportybet.feature.gift.gift.data.repository.GiftRepositoryImpl$redeemGift$1", f = "GiftRepositoryImpl.kt", l = {52, 54, 56}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super lk50<? extends eik>>, v1b<? super Unit>, Object> {
        public ResourceUiText a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = jrk.this.new a(this.e, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super lk50<? extends eik>> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x007e  */
        /* JADX WARN: Code duplicated, block: B:33:0x0080  */
        /* JADX WARN: Code duplicated, block: B:35:0x0083  */
        /* JADX WARN: Code duplicated, block: B:36:0x0089  */
        /* JADX WARN: Code duplicated, block: B:38:0x0091  */
        /* JADX WARN: Code duplicated, block: B:41:0x009e  */
        /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00bd, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L53;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r8.b
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L2b
                if (r2 == r5) goto L27
                if (r2 == r4) goto L1f
                if (r2 != r3) goto L19
                defpackage.uj50.b(r9)
                goto Lc0
            L19:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r6
            L1f:
                com.sporty.android.common_ui.uitext.ResourceUiText r2 = r8.a
                defpackage.uj50.b(r9)     // Catch: java.lang.Throwable -> L25
                goto L5e
            L25:
                r9 = move-exception
                goto L71
            L27:
                defpackage.uj50.b(r9)
                goto L3c
            L2b:
                defpackage.uj50.b(r9)
                lk50$b r9 = lk50.b.a
                r8.c = r0
                r8.b = r5
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r1) goto L3c
                goto Lbf
            L3c:
                jrk r9 = defpackage.jrk.this
                java.lang.String r2 = r8.e
                com.sporty.android.common_ui.uitext.ResourceUiText r5 = defpackage.vch0.b
                zi50$a r7 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L6f
                tnn r9 = r9.a     // Catch: java.lang.Throwable -> L6f
                r8.c = r0     // Catch: java.lang.Throwable -> L6f
                r8.a = r5     // Catch: java.lang.Throwable -> L6f
                r8.b = r4     // Catch: java.lang.Throwable -> L6f
                java.lang.Object r9 = r9.a     // Catch: java.lang.Throwable -> L6f
                vik r9 = (defpackage.vik) r9     // Catch: java.lang.Throwable -> L6f
                com.sportybet.feature.gift.gift.data.remote.dto.RedeemCodeRequestDto r4 = new com.sportybet.feature.gift.gift.data.remote.dto.RedeemCodeRequestDto     // Catch: java.lang.Throwable -> L6f
                r4.<init>(r2)     // Catch: java.lang.Throwable -> L6f
                java.lang.Object r9 = r9.c(r4, r8)     // Catch: java.lang.Throwable -> L6f
                if (r9 != r1) goto L5d
                goto Lbf
            L5d:
                r2 = r5
            L5e:
                com.sporty.android.common.network.data.BaseResponse r9 = (com.sporty.android.common.network.data.BaseResponse) r9     // Catch: java.lang.Throwable -> L25
                java.lang.Object r9 = defpackage.n52.b(r9)     // Catch: java.lang.Throwable -> L25
                xjk r9 = (defpackage.xjk) r9     // Catch: java.lang.Throwable -> L25
                eik r9 = defpackage.atf.a(r9)     // Catch: java.lang.Throwable -> L25
                zi50$a r4 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L25
                goto L79
            L6d:
                r2 = r5
                goto L71
            L6f:
                r9 = move-exception
                goto L6d
            L71:
                zi50$a r4 = defpackage.zi50.b
                zi50$b r4 = new zi50$b
                r4.<init>(r9)
                r9 = r4
            L79:
                boolean r4 = r9 instanceof zi50.b
                if (r4 == 0) goto L80
                r4 = r6
                goto L81
            L80:
                r4 = r9
            L81:
                if (r4 == 0) goto L89
                lk50$c r9 = new lk50$c
                r9.<init>(r4)
                goto Lb3
            L89:
                lk50$a r4 = new lk50$a
                java.lang.Throwable r5 = defpackage.zi50.a(r9)
                if (r5 != 0) goto L98
                java.lang.Throwable r5 = new java.lang.Throwable
                java.lang.String r7 = "Unknown error"
                r5.<init>(r7)
            L98:
                java.lang.Throwable r9 = defpackage.zi50.a(r9)
                if (r9 == 0) goto Laf
                boolean r7 = r9 instanceof defpackage.fk50
                if (r7 != 0) goto La3
                r9 = r6
            La3:
                fk50 r9 = (defpackage.fk50) r9
                if (r9 == 0) goto Laf
                com.sporty.android.common_ui.uitext.UiText r9 = r9.getText()
                if (r9 != 0) goto Lae
                goto Laf
            Lae:
                r2 = r9
            Laf:
                r4.<init>(r5, r2)
                r9 = r4
            Lb3:
                r8.c = r6
                r8.a = r6
                r8.b = r3
                java.lang.Object r8 = r0.emit(r9, r8)
                if (r8 != r1) goto Lc0
            Lbf:
                return r1
            Lc0:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: jrk.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public jrk(tnn tnnVar, ldt ldtVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, b25 b25Var) {
        this.a = tnnVar;
        this.b = ldtVar;
        this.c = k5bVar;
    }

    @Override // defpackage.brk
    public final Object a(boolean z, x1b x1bVar) {
        Object objD = ej5.d(this.c, new mrk(this, z, null), x1bVar);
        return objD == y5b.a ? objD : Unit.a;
    }

    @Override // defpackage.brk
    public final Object b(c990 c990Var) {
        return ej5.d(this.c, new erk(this, null), c990Var);
    }

    @Override // defpackage.brk
    public final yzh c(Integer num, Integer num2) {
        return bm50.a(new or60(new crk(this, num, num2, null)));
    }

    @Override // defpackage.brk
    public final lyh<lk50<eik>> d(String str) {
        str.getClass();
        return ozh.c(new or60(new a(str, null)), this.c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.brk
    public final Object e(x1b x1bVar) {
        irk irkVar;
        Throwable th;
        UiText uiText;
        Object bVar;
        UiText text;
        if (x1bVar instanceof irk) {
            irkVar = (irk) x1bVar;
            int i = irkVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                irkVar.d = i - Integer.MIN_VALUE;
            } else {
                irkVar = new irk(this, x1bVar);
            }
        } else {
            irkVar = new irk(this, x1bVar);
        }
        Object obj = irkVar.b;
        y5b y5bVar = y5b.a;
        int i2 = irkVar.d;
        if (i2 == 0) {
            uj50.b(obj);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                tnn tnnVar = this.a;
                irkVar.a = resourceUiText;
                irkVar.d = 1;
                Object objD = ((vik) tnnVar.a).d(irkVar);
                if (objD == y5bVar) {
                    return y5bVar;
                }
                obj = objD;
                uiText = resourceUiText;
            } catch (Throwable th2) {
                th = th2;
                uiText = resourceUiText;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiText = irkVar.a;
            try {
                uj50.b(obj);
            } catch (Throwable th3) {
                th = th3;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        bVar = Boolean.valueOf(((mel) n52.b((BaseResponse) obj)).getHasUsed());
        zi50.a aVar4 = zi50.b;
        Object obj2 = bVar instanceof zi50.b ? null : bVar;
        if (obj2 != null) {
            return new lk50.c(obj2);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            thA = new Throwable("Unknown error");
        }
        Throwable thA2 = zi50.a(bVar);
        if (thA2 != null) {
            fk50 fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
            if (fk50Var != null && (text = fk50Var.getText()) != null) {
                uiText = text;
            }
        }
        return new lk50.a(thA, uiText);
    }

    @Override // defpackage.brk
    public final Object f(d990 d990Var) {
        return ej5.d(this.c, new frk(this, null), d990Var);
    }

    @Override // defpackage.brk
    public final Object g(String str, c990 c990Var) {
        Object objD = ej5.d(this.c, new krk(this, str, null), c990Var);
        return objD == y5b.a ? objD : Unit.a;
    }

    @Override // defpackage.brk
    public final Object h(long j, k.c cVar) {
        Object objD = ej5.d(this.c, new lrk(this, j, null), cVar);
        return objD == y5b.a ? objD : Unit.a;
    }

    @Override // defpackage.brk
    public final or60 i(int i) {
        return new or60(new drk(this, i, null));
    }

    @Override // defpackage.brk
    public final Object j(k.c cVar) {
        Object objD = ej5.d(this.c, new nrk(this, null), cVar);
        return objD == y5b.a ? objD : Unit.a;
    }

    @Override // defpackage.brk
    public final Object k(d990 d990Var) {
        return ej5.d(this.c, new hrk(this, null), d990Var);
    }

    @Override // defpackage.brk
    public final yzh l(String str) {
        str.getClass();
        return bm50.a(new or60(new ork(this, str, null)));
    }

    @Override // defpackage.brk
    public final Object m(c990 c990Var) {
        return ej5.d(this.c, new grk(this, null), c990Var);
    }
}
