package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.feature.luckynumber.lobby.data.dto.LNResultDrawDTO;
import com.sportybet.feature.luckynumber.lobby.data.dto.LNResultResponseDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGetResultsUseCase$invoke$resultFlow$1", f = "LNGetResultsUseCase.kt", l = {70}, m = "invokeSuspend", v = 2)
public final class ncq extends tje0 implements Function2<myh<? super lk50<? extends icq.b>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a390<Unit> c;
    public final /* synthetic */ icq d;
    public final /* synthetic */ String e;

    public static final class a<T> implements myh {
        public final /* synthetic */ dq40<List<mk90>> a;
        public final /* synthetic */ myh<lk50<icq.b>> b;
        public final /* synthetic */ icq c;
        public final /* synthetic */ dq40<String> d;
        public final /* synthetic */ yp40 e;

        /* JADX INFO: renamed from: ncq$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGetResultsUseCase$invoke$resultFlow$1$3", f = "LNGetResultsUseCase.kt", l = {73, 87, 98, 100}, m = "emit", v = 2)
        public static final class C0892a extends x1b {
            public /* synthetic */ Object a;
            public final /* synthetic */ a<T> b;
            public int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0892a(a<? super T> aVar, v1b<? super C0892a> v1bVar) {
                super(v1bVar);
                this.b = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.c |= Integer.MIN_VALUE;
                return this.b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(dq40<List<mk90>> dq40Var, myh<? super lk50<icq.b>> myhVar, icq icqVar, dq40<String> dq40Var2, yp40 yp40Var) {
            this.a = dq40Var;
            this.b = myhVar;
            this.c = icqVar;
            this.d = dq40Var2;
            this.e = yp40Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
        
            if (r2.emit(r11, r0) == r1) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00ee, code lost:
        
            if (r2.emit(r11, r0) == r1) goto L45;
         */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(defpackage.lk50<icq.b> r11, defpackage.v1b<? super kotlin.Unit> r12) {
            /*
                Method dump skipped, instruction units count: 255
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ncq.a.emit(lk50, v1b):java.lang.Object");
        }
    }

    public static final class b implements lyh<Unit> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ yp40 b;

        @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGetResultsUseCase$invoke$resultFlow$1$invokeSuspend$$inlined$filter$1", f = "LNGetResultsUseCase.kt", l = {109}, m = "collect", v = 2)
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
                return b.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: ncq$b$b, reason: collision with other inner class name */
        public static final class C0893b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ yp40 b;

            /* JADX INFO: renamed from: ncq$b$b$a */
            @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGetResultsUseCase$invoke$resultFlow$1$invokeSuspend$$inlined$filter$1$2", f = "LNGetResultsUseCase.kt", l = {50}, m = "emit", v = 2)
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
                    return C0893b.this.emit(null, this);
                }
            }

            public C0893b(myh myhVar, yp40 yp40Var) {
                this.a = myhVar;
                this.b = yp40Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
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
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    if (!this.b.a) {
                        aVar.b = 1;
                        if (this.a.emit(obj, aVar) == y5bVar) {
                            return y5bVar;
                        }
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

        public b(lyh lyhVar, yp40 yp40Var) {
            this.a = lyhVar;
            this.b = yp40Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
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
                C0893b c0893b = new C0893b(myhVar, this.b);
                aVar.b = 1;
                if (this.a.collect(c0893b, aVar) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGetResultsUseCase$invoke$resultFlow$1$invokeSuspend$$inlined$flatMapLatest$1", f = "LNGetResultsUseCase.kt", l = {189}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super lk50<? extends icq.b>>, Unit, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object c;
        public final /* synthetic */ icq d;
        public final /* synthetic */ dq40 e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, icq icqVar, dq40 dq40Var, String str) {
            super(3, v1bVar);
            this.d = icqVar;
            this.e = dq40Var;
            this.f = str;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super lk50<? extends icq.b>> myhVar, Unit unit, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d, this.e, this.f);
            cVar.b = myhVar;
            cVar.c = unit;
            return cVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                icq icqVar = this.d;
                i6u i6uVar = icqVar.a;
                String str = (String) this.e.a;
                i6uVar.getClass();
                yzh yzhVarA = bm50.a(new d(i6uVar.c(new o6u(i6uVar, 20, str, this.f, null)), icqVar));
                this.b = null;
                this.c = null;
                this.a = 1;
                if (kzh.c(myhVar, yzhVarA, this) == y5bVar) {
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

    public static final class d implements lyh<icq.b> {
        public final /* synthetic */ or60 a;
        public final /* synthetic */ icq b;

        @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGetResultsUseCase$invoke$resultFlow$1$invokeSuspend$lambda$1$$inlined$map$1", f = "LNGetResultsUseCase.kt", l = {109}, m = "collect", v = 2)
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
                return d.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGetResultsUseCase$invoke$resultFlow$1$invokeSuspend$lambda$1$$inlined$map$1$2", f = "LNGetResultsUseCase.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, icq icqVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
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
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    LNResultResponseDTO lNResultResponseDTO = (LNResultResponseDTO) n52.b((BaseResponse) obj);
                    List<LNResultDrawDTO> draws = lNResultResponseDTO.getDraws();
                    ArrayList arrayList = new ArrayList(l48.r(draws, 10));
                    Iterator<T> it = draws.iterator();
                    while (it.hasNext()) {
                        arrayList.add(nk90.a((LNResultDrawDTO) it.next()));
                    }
                    icq.b bVar = new icq.b(a4h.f(arrayList), lNResultResponseDTO.getNextCursor() != null ? new icq.a.c(lNResultResponseDTO.getNextCursor()) : icq.a.C0674a.a);
                    aVar.b = 1;
                    if (this.a.emit(bVar, aVar) == y5bVar) {
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

        public d(or60 or60Var, icq icqVar) {
            this.a = or60Var;
            this.b = icqVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super icq.b> myhVar, v1b v1bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncq(a390 a390Var, icq icqVar, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.c = a390Var;
        this.d = icqVar;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ncq ncqVar = new ncq(this.c, this.d, this.e, v1bVar);
        ncqVar.b = obj;
        return ncqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super lk50<? extends icq.b>> myhVar, v1b<? super Unit> v1bVar) {
        return ((ncq) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [T, java.util.ArrayList] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            dq40 dq40VarA = j6w.a(obj);
            dq40VarA.a = new ArrayList();
            dq40 dq40Var = new dq40();
            yp40 yp40Var = new yp40();
            b bVar = new b(ozh.a(r0i.e(new gzh(Unit.a), this.c), 0, pb5.c), yp40Var);
            icq icqVar = this.d;
            b77 b77VarF = r0i.f(bVar, new c(null, icqVar, dq40Var, this.e));
            a aVar = new a(dq40VarA, myhVar, icqVar, dq40Var, yp40Var);
            this.b = null;
            this.a = 1;
            if (b77VarF.collect(aVar, this) == y5bVar) {
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
