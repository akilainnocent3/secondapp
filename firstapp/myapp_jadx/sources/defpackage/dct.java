package defpackage;

import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class dct implements lyh<kqz<LobbyV2GameDetailsModel>> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ int b;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: dct$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel$removeFavouriteFromUI$$inlined$map$1$2", f = "LobbyV2ViewModel.kt", l = {50}, m = "emit", v = 1)
        public static final class C0482a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0482a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(myh myhVar, int i) {
            this.a = myhVar;
            this.b = i;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            C0482a c0482a;
            if (v1bVar instanceof C0482a) {
                c0482a = (C0482a) v1bVar;
                int i = c0482a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0482a.b = i - Integer.MIN_VALUE;
                } else {
                    c0482a = new C0482a(v1bVar);
                }
            } else {
                c0482a = new C0482a(v1bVar);
            }
            Object obj2 = c0482a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0482a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                kqz kqzVarA = vqz.a((kqz) obj, new ect(this.b, null));
                c0482a.b = 1;
                if (this.a.emit(kqzVarA, c0482a) == y5bVar) {
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

    public dct(lyh lyhVar, int i) {
        this.a = lyhVar;
        this.b = i;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super kqz<LobbyV2GameDetailsModel>> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
