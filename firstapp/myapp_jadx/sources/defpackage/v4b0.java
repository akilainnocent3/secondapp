package defpackage;

import com.google.protobuf.Reader;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.spin2win.model.local.LocalGameDetailsEntity;
import com.sportygames.spin2win.model.response.ChatRoomResponse;
import com.sportygames.spin2win.model.response.GameAvailableResponse;
import com.sportygames.spin2win.model.response.GameDetailsResponse;
import com.sportygames.spin2win.model.response.GameInfoResponse;
import com.sportygames.spin2win.model.response.NumberBetDetails;
import com.sportygames.spin2win.model.response.RecentWinsResponse;
import com.sportygames.spin2win.model.response.Spin2WinPlaceBetResponse;
import com.sportygames.spin2win.model.response.UserValidateResponse;
import com.sportygames.spin2win.model.response.WalletInfoResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lv4b0;", "Lj8i0;", "<init>", "()V", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v4b0 extends j8i0 {
    public final v340 A;
    public final v340 B;
    public final ssw<LoadingState<HTTPResponse<GameInfoResponse>>> C;
    public final ssw<LoadingState<HTTPResponse<List<ChatRoomResponse>>>> D;
    public final ssw<LoadingState<HTTPResponse<PromotionGiftsResponse>>> E;
    public final ssw<LoadingState<HTTPResponse<PromotionGiftsResponse>>> F;
    public final ssw<LoadingState<HTTPResponse<List<GameDetails>>>> G;
    public final ssw<LoadingState<HTTPResponse<Spin2WinPlaceBetResponse>>> H;
    public final ssw<LoadingState<HTTPResponse<RecentWinsResponse>>> I;
    public final ssw<Boolean> J;
    public Double a;
    public String b;
    public Integer c;
    public final u4b0 d = u4b0.a;
    public final wwd0 e = xwd0.a(new z3b0(0));
    public final ArrayList f = new ArrayList();
    public final ssw<LoadingState<HTTPResponse<GameAvailableResponse>>> i = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<UserValidateResponse>>> v = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<WalletInfoResponse>>> w = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<GameDetailsResponse>>> y;
    public final v340 z;

    public static final class a {
        public final String a;
        public final Integer b;
        public final String c;

        public a(String str, Integer num, String str2) {
            this.a = str;
            this.b = num;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return uf80.a(ew7.a(this.b, "BetRecord(category=", this.a, ", value=", ", betType="), this.c, ")");
        }
    }

    @c0d(c = "com.sportygames.spin2win.viewmodel.Spin2WinViewModel$gameAvailableStatus$1", f = "Spin2WinViewModel.kt", l = {123}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return v4b0.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objD;
            v4b0 v4b0Var = v4b0.this;
            ssw<LoadingState<HTTPResponse<GameAvailableResponse>>> sswVar = v4b0Var.i;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                u4b0 u4b0Var = v4b0Var.d;
                this.a = 1;
                u4b0Var.getClass();
                pfd pfdVar = fse.a;
                objD = ej5.d(odd.b, new a52(new q4b0(1, null), null), this);
                if (objD == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objD = obj;
            }
            ResultWrapper resultWrapper = (ResultWrapper) objD;
            if (resultWrapper instanceof ResultWrapper.Success) {
                sswVar.j(new LoadingState<>(Status.SUCCESS, ((ResultWrapper.Success) resultWrapper).getValue(), null, null, null, 16, null));
            } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
                sswVar.j(new LoadingState<>(Status.FAILED, null, new ResultWrapper.GenericError(null, new HTTPResponse(new Integer(-11), null, null, null, null, null, null, 64, null)), (ResultWrapper.NetworkError) resultWrapper, null, 16, null));
            } else {
                Status status = Status.FAILED;
                resultWrapper.getClass();
                sswVar.j(new LoadingState<>(status, null, (ResultWrapper.GenericError) resultWrapper, null, null, 16, null));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.spin2win.viewmodel.Spin2WinViewModel$getPromotionalGifts$1", f = "Spin2WinViewModel.kt", l = {358}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return v4b0.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v4b0 v4b0Var = v4b0.this;
            ssw<LoadingState<HTTPResponse<PromotionGiftsResponse>>> sswVar = v4b0Var.E;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                u4b0 u4b0Var = v4b0Var.d;
                this.a = 1;
                u4b0Var.getClass();
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new a52(new o4b0(1, null), null), this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ResultWrapper resultWrapper = (ResultWrapper) obj;
            if (resultWrapper instanceof ResultWrapper.Success) {
                sswVar.j(new LoadingState<>(Status.SUCCESS, ((ResultWrapper.Success) resultWrapper).getValue(), null, null, null, 16, null));
            } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
                sswVar.j(new LoadingState<>(Status.FAILED, null, null, (ResultWrapper.NetworkError) resultWrapper, null, 16, null));
            } else {
                Status status = Status.FAILED;
                resultWrapper.getClass();
                sswVar.j(new LoadingState<>(status, null, (ResultWrapper.GenericError) resultWrapper, null, null, 16, null));
            }
            return Unit.a;
        }
    }

    public static final class d implements lyh<uf00<? extends NumberBetDetails>> {
        public final /* synthetic */ lyh a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: v4b0$d$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.spin2win.viewmodel.Spin2WinViewModel$special$$inlined$map$1$2", f = "Spin2WinViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C1202a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1202a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
            public final Object emit(Object obj, v1b v1bVar) {
                C1202a c1202a;
                List listF;
                GameDetailsResponse gameDetailsResponse;
                List<NumberBetDetails> numberBetDetails;
                if (v1bVar instanceof C1202a) {
                    c1202a = (C1202a) v1bVar;
                    int i = c1202a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1202a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1202a = new C1202a(v1bVar);
                    }
                } else {
                    c1202a = new C1202a(v1bVar);
                }
                Object obj2 = c1202a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1202a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    HTTPResponse hTTPResponse = (HTTPResponse) ((LoadingState) obj).getData();
                    if (hTTPResponse == null || (gameDetailsResponse = (GameDetailsResponse) hTTPResponse.getData()) == null || (numberBetDetails = gameDetailsResponse.getNumberBetDetails()) == null || (listF = a4h.f(numberBetDetails)) == null) {
                        listF = n1a0.c;
                    }
                    c1202a.b = 1;
                    if (this.a.emit(listF, c1202a) == y5bVar) {
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

        public d(lyh lyhVar) {
            this.a = lyhVar;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super uf00<? extends NumberBetDetails>> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public static final class e implements lyh<Integer> {
        public final /* synthetic */ lyh a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: v4b0$e$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.spin2win.viewmodel.Spin2WinViewModel$special$$inlined$mapNotNull$1$2", f = "Spin2WinViewModel.kt", l = {52}, m = "emit", v = 1)
            public static final class C1203a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1203a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1203a c1203a;
                GameDetailsResponse gameDetailsResponse;
                if (v1bVar instanceof C1203a) {
                    c1203a = (C1203a) v1bVar;
                    int i = c1203a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1203a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1203a = new C1203a(v1bVar);
                    }
                } else {
                    c1203a = new C1203a(v1bVar);
                }
                Object obj2 = c1203a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1203a.b;
                Integer maxBetCoverage = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    HTTPResponse hTTPResponse = (HTTPResponse) ((LoadingState) obj).getData();
                    if (hTTPResponse != null && (gameDetailsResponse = (GameDetailsResponse) hTTPResponse.getData()) != null) {
                        maxBetCoverage = gameDetailsResponse.getMaxBetCoverage();
                    }
                    if (maxBetCoverage != null) {
                        c1203a.b = 1;
                        if (this.a.emit(maxBetCoverage, c1203a) == y5bVar) {
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

        public e(lyh lyhVar) {
            this.a = lyhVar;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super Integer> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public static final class f implements lyh<Integer> {
        public final /* synthetic */ lyh a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: v4b0$f$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.spin2win.viewmodel.Spin2WinViewModel$special$$inlined$mapNotNull$2$2", f = "Spin2WinViewModel.kt", l = {52}, m = "emit", v = 1)
            public static final class C1204a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1204a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1204a c1204a;
                GameDetailsResponse gameDetailsResponse;
                if (v1bVar instanceof C1204a) {
                    c1204a = (C1204a) v1bVar;
                    int i = c1204a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1204a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1204a = new C1204a(v1bVar);
                    }
                } else {
                    c1204a = new C1204a(v1bVar);
                }
                Object obj2 = c1204a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1204a.b;
                Integer maxBetCount = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    HTTPResponse hTTPResponse = (HTTPResponse) ((LoadingState) obj).getData();
                    if (hTTPResponse != null && (gameDetailsResponse = (GameDetailsResponse) hTTPResponse.getData()) != null) {
                        maxBetCount = gameDetailsResponse.getMaxBetCount();
                    }
                    if (maxBetCount != null) {
                        c1204a.b = 1;
                        if (this.a.emit(maxBetCount, c1204a) == y5bVar) {
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

        public f(lyh lyhVar) {
            this.a = lyhVar;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super Integer> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public v4b0() {
        ssw<LoadingState<HTTPResponse<GameDetailsResponse>>> sswVar = new ssw<>();
        this.y = sswVar;
        e eVar = new e(i2i.a(sswVar));
        et7 et7VarD = o8i0.d(this);
        Integer numValueOf = Integer.valueOf(Reader.READ_DONE);
        kwd0 kwd0Var = q490.a.a;
        this.z = e1i.e(eVar, et7VarD, kwd0Var, numValueOf);
        this.A = e1i.e(new f(i2i.a(sswVar)), o8i0.d(this), kwd0Var, numValueOf);
        this.B = e1i.e(new d(i2i.a(sswVar)), o8i0.d(this), kwd0Var, n1a0.c);
        this.C = new ssw<>();
        this.D = new ssw<>();
        this.E = new ssw<>();
        this.F = new ssw<>();
        this.G = new ssw<>();
        this.H = new ssw<>();
        this.I = new ssw<>();
        this.J = new ssw<>();
    }

    public final void A1() {
        ej5.c(o8i0.d(this), null, null, new c5b0(this, null), 3);
    }

    public final mxa0 x1(LocalGameDetailsEntity localGameDetailsEntity, boolean z) {
        a aVar = new a(localGameDetailsEntity != null ? localGameDetailsEntity.getCategory() : null, localGameDetailsEntity != null ? localGameDetailsEntity.getValue() : null, localGameDetailsEntity != null ? localGameDetailsEntity.getBetType() : null);
        ArrayList arrayList = this.f;
        if (arrayList.size() >= ((Number) this.A.a.getValue()).intValue() && !arrayList.contains(aVar)) {
            return mxa0.a.a;
        }
        wwd0 wwd0Var = this.e;
        z3b0 z3b0VarA = ls6.a((z3b0) wwd0Var.getValue(), ((Number) this.z.a.getValue()).intValue(), (uf00) this.B.a.getValue(), localGameDetailsEntity);
        if (z3b0VarA == null) {
            return mxa0.b.a;
        }
        if (z) {
            if (arrayList.contains(aVar)) {
                aVar = null;
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
            wwd0Var.getClass();
            wwd0Var.k(null, z3b0VarA);
        }
        return mxa0.c.a;
    }

    public final void y1() {
        ej5.c(o8i0.d(this), null, null, new b(null), 3);
    }

    public final void z1() {
        ej5.c(o8i0.d(this), null, null, new c(null), 3);
    }
}
