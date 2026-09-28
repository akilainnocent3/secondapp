package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.loyalty.impl.challenge.presentation.model.ChallengeCardStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo37;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class o37 extends j8i0 {
    public final ku90<xz6> A;
    public final t340 B;
    public final v340 C;
    public final u2k a;
    public final ctz b;
    public final mb6 c;
    public final j37 d;
    public final mgb0 e;
    public final zvt f;
    public final rdd0 i;
    public uf00<iz6> v;
    public boolean w;
    public final wwd0 y;
    public final v340 z;

    @c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.ChallengeViewModel$1", f = "ChallengeViewModel.kt", l = {154}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ boolean b;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = o37.this.new a(v1bVar);
            aVar.b = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            o37 o37Var = o37.this;
            if (i == 0) {
                uj50.b(obj);
                if (z) {
                    f1i f1iVar = new f1i(o37Var.e.getAccountInfoFlow());
                    this.b = z;
                    this.a = 1;
                    if (s0i.a(f1iVar, this) == y5bVar) {
                        return y5bVar;
                    }
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ej5.c(o8i0.d(o37Var), null, null, new r37(o37Var, null, null), 3);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.ChallengeViewModel$2", f = "ChallengeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<m0u, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = o37.this.new b(v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(m0u m0uVar, v1b<? super Unit> v1bVar) {
            return ((b) create(m0uVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            m0u m0uVar = (m0u) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            o37.this.y1(new xz6.e(R.string.page_loyalty__challenge_tier_mismatch_toast, new Integer(d720.a(m0uVar))));
            return Unit.a;
        }
    }

    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[rw6.j.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                rw6.j jVar = rw6.j.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                rw6.j jVar2 = rw6.j.a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[f07.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr2;
            int[] iArr3 = new int[dua.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                dua duaVar = dua.a;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr3;
        }
    }

    @c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.ChallengeViewModel$emitEffect$1", f = "ChallengeViewModel.kt", l = {557}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ xz6 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xz6 xz6Var, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.c = xz6Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return o37.this.new d(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ku90<xz6> ku90Var = o37.this.A;
                this.a = 1;
                if (ku90Var.a.emit(this.c, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.ChallengeViewModel$ongoingCountdown$2$1", f = "ChallengeViewModel.kt", l = {110, 116}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<myh<? super UiText>, v1b<? super Unit>, Object> {
        public long a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ Long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Long l, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.d = l;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = new e(this.d, v1bVar);
            eVar.c = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super UiText> myhVar, v1b<? super Unit> v1bVar) {
            return ((e) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0021  */
        /* JADX WARN: Code duplicated, block: B:13:0x002b  */
        /* JADX WARN: Code duplicated, block: B:16:0x0059 A[PHI: r5
          0x0059: PHI (r5v2 long) = (r5v1 long), (r5v3 long) binds: [B:14:0x0056, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x005f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0073 -> B:11:0x0021). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r9.b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1e
                if (r2 == r4) goto L18
                if (r2 != r3) goto L11
                goto L1e
            L11:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r9)
                r9 = 0
                return r9
            L18:
                long r5 = r9.a
                defpackage.uj50.b(r10)
                goto L59
            L1e:
                defpackage.uj50.b(r10)
            L21:
                kotlin.coroutines.CoroutineContext r10 = r9.getContext()
                boolean r10 = defpackage.i9p.h(r10)
                if (r10 == 0) goto L76
                java.lang.Long r10 = r9.d
                long r5 = r10.longValue()
                long r7 = java.lang.System.currentTimeMillis()
                long r5 = r5 - r7
                com.sporty.android.common_ui.uitext.ConcatUiText r10 = defpackage.w250.b(r5)
                java.lang.Object[] r10 = new java.lang.Object[]{r10}
                com.sporty.android.common_ui.uitext.StringUiText r2 = defpackage.vch0.a
                com.sporty.android.common_ui.uitext.ResourceUiText r2 = new com.sporty.android.common_ui.uitext.ResourceUiText
                java.util.List r10 = defpackage.ay0.S(r10)
                r7 = 2132022013(0x7f1412fd, float:1.9682434E38)
                r2.<init>(r7, r10)
                r9.c = r0
                r9.a = r5
                r9.b = r4
                java.lang.Object r10 = r0.emit(r2, r9)
                if (r10 != r1) goto L59
                goto L75
            L59:
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L76
                kotlin.time.b$a r10 = kotlin.time.b.b
                r7 = 1000(0x3e8, double:4.94E-321)
                rgf r10 = defpackage.rgf.MILLISECONDS
                long r7 = kotlin.time.c.i(r7, r10)
                r9.c = r0
                r9.a = r5
                r9.b = r3
                java.lang.Object r10 = defpackage.hkd.c(r7, r9)
                if (r10 != r1) goto L21
            L75:
                return r1
            L76:
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: o37.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.ChallengeViewModel$special$$inlined$flatMapLatest$1", f = "ChallengeViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements gaj<myh<? super UiText>, Long, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object c;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super UiText> myhVar, Long l, v1b<? super Unit> v1bVar) {
            f fVar = new f(3, v1bVar);
            fVar.b = myhVar;
            fVar.c = l;
            return fVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                Long l = (Long) this.c;
                lyh gzhVar = l == null ? new gzh(null) : new or60(new e(l, null));
                this.b = null;
                this.c = null;
                this.a = 1;
                if (kzh.c(myhVar, gzhVar, this) == y5bVar) {
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

    public static final class g implements lyh<Long> {
        public final /* synthetic */ wwd0 a;

        @c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.ChallengeViewModel$special$$inlined$map$1", f = "ChallengeViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return g.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.ChallengeViewModel$special$$inlined$map$1$2", f = "ChallengeViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                uf00<iz6> uf00Var;
                iz6 next;
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
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                Long l = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    tz6 tz6Var = ((r17) obj).a;
                    tz6.c cVar = tz6Var instanceof tz6.c ? (tz6.c) tz6Var : null;
                    if (cVar != null && (uf00Var = cVar.c) != null) {
                        Iterator<iz6> it = uf00Var.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (next.l != ChallengeCardStatus.Ongoing);
                        iz6 iz6Var = next;
                        if (iz6Var != null) {
                            l = iz6Var.d;
                        }
                    }
                    aVar.b = 1;
                    if (this.a.emit(l, aVar) == y5bVar) {
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

        public g(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Long> myhVar, v1b v1bVar) throws Throwable {
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
            if (i2 != 0) {
                if (i2 == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            b bVar = new b(myhVar);
            aVar.b = 1;
            this.a.collect(bVar, aVar);
            return y5bVar;
        }
    }

    public o37(u2k u2kVar, ctz ctzVar, mb6 mb6Var, j37 j37Var, mgb0 mgb0Var, zvt zvtVar, rdd0 rdd0Var, vxt vxtVar, wib0 wib0Var) {
        u2kVar.getClass();
        ctzVar.getClass();
        mb6Var.getClass();
        j37Var.getClass();
        mgb0Var.getClass();
        zvtVar.getClass();
        rdd0Var.getClass();
        wib0Var.getClass();
        this.a = u2kVar;
        this.b = ctzVar;
        this.c = mb6Var;
        this.d = j37Var;
        this.e = mgb0Var;
        this.f = zvtVar;
        this.i = rdd0Var;
        this.v = n1a0.c;
        wwd0 wwd0VarA = xwd0.a(new r17(null, 15));
        this.y = wwd0VarA;
        this.z = e1i.b(wwd0VarA);
        new ku90();
        ku90<xz6> ku90Var = new ku90<>();
        this.A = ku90Var;
        this.B = e1i.a(ku90Var);
        this.C = e1i.e(r0i.f(uzh.b(new g(wwd0VarA)), new f(3, null)), o8i0.d(this), new mwd0(5000L, Long.MAX_VALUE), null);
        wib0Var.b(o8i0.d(this), kotlin.collections.b.k(kz6.LongestOddsWinBg, kz6.BiggestNetProfitBg, kz6.BiggestSingleWinBg, kz6.CardBg, kz6.CardExpandedBg), "default");
        z1(i37.p.a);
        ej5.c(o8i0.d(this), null, null, new r37(this, null, null), 3);
        kzh.d(new g1i(fc4.a(uzh.b(mgb0Var.isLoginFlow()), 1), new a(null)), o8i0.d(this));
        kzh.d(new g1i(new b720(new a720(fc4.a(uzh.b(mgb0Var.isLoginFlow()), 1)), vxtVar), new b(null)), o8i0.d(this));
    }

    public final uf00<iz6> x1(f07 f07Var) {
        int i = c.a[f07Var.ordinal()];
        List list = this.v;
        if (i != 1) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                ChallengeCardStatus challengeCardStatus = ((iz6) obj).l;
                challengeCardStatus.getClass();
                f07 f07Var2 = null;
                switch (jz6.a[challengeCardStatus.ordinal()]) {
                    case 1:
                    case 2:
                        f07Var2 = f07.c;
                        break;
                    case 3:
                        f07Var2 = f07.b;
                        break;
                    case 4:
                        f07Var2 = f07.d;
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        break;
                    default:
                        uhc.a();
                        return null;
                }
                if (f07Var2 == f07Var) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        return a4h.f(list);
    }

    public final void y1(xz6 xz6Var) {
        ej5.c(o8i0.d(this), null, null, new d(xz6Var, null), 3);
    }

    public final void z1(i37 i37Var) {
        this.i.a(i37Var, k00.d);
    }
}
