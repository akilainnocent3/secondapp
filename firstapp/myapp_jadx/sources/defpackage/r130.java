package defpackage;

import com.sporty.android.core.model.patron.KYCBannerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.ProfileViewModel$getKYCTiers$1", f = "ProfileViewModel.kt", l = {305, 468}, m = "invokeSuspend", v = 2)
public final class r130 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ a230 b;

    public static final class a implements lyh<Unit> {
        public final /* synthetic */ yzh a;
        public final /* synthetic */ a230 b;
        public final /* synthetic */ boolean c;

        /* JADX INFO: renamed from: r130$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.profile.ProfileViewModel$getKYCTiers$1$invokeSuspend$$inlined$collectApiResult$default$1", f = "ProfileViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C1031a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1031a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ a230 b;
            public final /* synthetic */ boolean c;

            /* JADX INFO: renamed from: r130$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.profile.ProfileViewModel$getKYCTiers$1$invokeSuspend$$inlined$collectApiResult$default$1$2", f = "ProfileViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C1032a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1032a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, a230 a230Var, boolean z) {
                this.a = myhVar;
                this.b = a230Var;
                this.c = z;
            }

            /* JADX WARN: Code duplicated, block: B:37:0x0094  */
            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1032a c1032a;
                zi50 zi50Var;
                T next;
                wwd0 wwd0Var = this.b.C;
                if (v1bVar instanceof C1032a) {
                    c1032a = (C1032a) v1bVar;
                    int i = c1032a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1032a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1032a = new C1032a(v1bVar);
                    }
                } else {
                    c1032a = new C1032a(v1bVar);
                }
                Object obj2 = c1032a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1032a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    lk50 lk50Var = (lk50) obj;
                    if (lk50Var instanceof lk50.c) {
                        List list = (List) ((lk50.c) lk50Var).a;
                        if (this.c) {
                            zi50Var = new zi50(list);
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next = (T) null;
                                    break;
                                }
                                next = it.next();
                                KYCBannerItem kYCBannerItem = (KYCBannerItem) next;
                                if (kYCBannerItem.getLevel() == 3 && kYCBannerItem.getStatus() != 10) {
                                    break;
                                }
                            }
                            if (next != null) {
                                zi50Var = new zi50(list);
                            } else {
                                zi50.a aVar = zi50.b;
                                ArrayList arrayList = new ArrayList();
                                for (T t : list) {
                                    if (((KYCBannerItem) t).getLevel() != 3) {
                                        arrayList.add(t);
                                    }
                                }
                                zi50Var = new zi50(arrayList);
                            }
                        }
                        wwd0Var.getClass();
                        wwd0Var.k(null, zi50Var);
                    } else if (lk50Var instanceof lk50.a) {
                        zi50.a aVar2 = zi50.b;
                        zi50 zi50Var2 = new zi50(uj50.a(((lk50.a) lk50Var).a));
                        wwd0Var.getClass();
                        wwd0Var.k(null, zi50Var2);
                    } else if (!(lk50Var instanceof lk50.b)) {
                        uhc.a();
                        return null;
                    }
                    Unit unit = Unit.a;
                    c1032a.b = 1;
                    if (this.a.emit(unit, c1032a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public a(yzh yzhVar, a230 a230Var, boolean z) {
            this.a = yzhVar;
            this.b = a230Var;
            this.c = z;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
            C1031a c1031a;
            if (v1bVar instanceof C1031a) {
                c1031a = (C1031a) v1bVar;
                int i = c1031a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1031a.b = i - Integer.MIN_VALUE;
                } else {
                    c1031a = new C1031a(v1bVar);
                }
            } else {
                c1031a = new C1031a(v1bVar);
            }
            Object obj = c1031a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1031a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b, this.c);
                c1031a.b = 1;
                if (this.a.collect(bVar, c1031a) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r130(a230 a230Var, v1b<? super r130> v1bVar) {
        super(2, v1bVar);
        this.b = a230Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new r130(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((r130) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (defpackage.kzh.a(r3, r6) == r0) goto L18;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.a
            r2 = 2
            r3 = 1
            a230 r4 = r6.b
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L12
            defpackage.uj50.b(r7)
            goto L63
        L12:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L19:
            defpackage.uj50.b(r7)
            goto L3b
        L1d:
            defpackage.uj50.b(r7)
            gip r7 = r4.d
            r6.a = r3
            psm r1 = r7.b
            boolean r1 = r1.F()
            if (r1 == 0) goto L36
            r1 = 0
            zed r7 = r7.a
            java.lang.String r3 = "show_tier_level_3"
            java.lang.Object r7 = r7.getBoolean(r3, r1, r6)
            goto L38
        L36:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
        L38:
            if (r7 != r0) goto L3b
            goto L62
        L3b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            lyz r1 = r4.e
            lyh r1 = r1.b()
            com.sporty.android.common_ui.uitext.StringUiText r3 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r3 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r5 = 2132018156(0x7f1403ec, float:1.967461E38)
            r3.<init>(r5)
            yzh r1 = defpackage.bm50.b(r1, r3)
            r130$a r3 = new r130$a
            r3.<init>(r1, r4, r7)
            r6.a = r2
            java.lang.Object r6 = defpackage.kzh.a(r3, r6)
            if (r6 != r0) goto L63
        L62:
            return r0
        L63:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r130.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
