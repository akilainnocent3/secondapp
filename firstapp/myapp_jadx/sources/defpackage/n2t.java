package defpackage;

import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2HomeItemModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.components.LobbyV2BannerRowComponentKt$LobbyV2BannerRowComponent$1$1", f = "LobbyV2BannerRowComponent.kt", l = {}, m = "invokeSuspend", v = 1)
public final class n2t extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ zpz b;
    public final /* synthetic */ int c;
    public final /* synthetic */ twd0<Boolean> d;
    public final /* synthetic */ List<LobbyV2GameDetailsModel> e;
    public final /* synthetic */ l1z f;
    public final /* synthetic */ LobbyV2HomeItemModel i;

    @c0d(c = "com.sportygames.compose.lobbyv2.components.LobbyV2BannerRowComponentKt$LobbyV2BannerRowComponent$1$1$1", f = "LobbyV2BannerRowComponent.kt", l = {82, 84}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zpz b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, v1b v1bVar, zpz zpzVar) {
            super(2, v1bVar);
            this.b = zpzVar;
            this.c = i;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.c, v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001b  */
        /* JADX WARN: Code duplicated, block: B:14:0x0026  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0036 -> B:11:0x001b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r6.a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L18
                if (r1 == r3) goto L14
                if (r1 != r2) goto Ld
                goto L18
            Ld:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                r6 = 0
                return r6
            L14:
                defpackage.uj50.b(r7)
                goto L26
            L18:
                defpackage.uj50.b(r7)
            L1b:
                r6.a = r3
                r4 = 5000(0x1388, double:2.4703E-320)
                java.lang.Object r7 = defpackage.hkd.b(r4, r6)
                if (r7 != r0) goto L26
                goto L38
            L26:
                zpz r7 = r6.b
                int r1 = r7.k()
                int r1 = r1 + r3
                int r4 = r6.c
                int r1 = r1 % r4
                r6.a = r2
                java.lang.Object r7 = defpackage.zpz.g(r1, r6, r7)
                if (r7 != r0) goto L1b
            L38:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: n2t.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.compose.lobbyv2.components.LobbyV2BannerRowComponentKt$LobbyV2BannerRowComponent$1$1$2", f = "LobbyV2BannerRowComponent.kt", l = {90}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zpz b;
        public final /* synthetic */ int c;
        public final /* synthetic */ twd0<Boolean> d;
        public final /* synthetic */ List<LobbyV2GameDetailsModel> e;
        public final /* synthetic */ l1z f;
        public final /* synthetic */ LobbyV2HomeItemModel i;

        public static final class a<T> implements myh {
            public final /* synthetic */ int a;
            public final /* synthetic */ twd0<Boolean> b;
            public final /* synthetic */ List<LobbyV2GameDetailsModel> c;
            public final /* synthetic */ l1z d;
            public final /* synthetic */ LobbyV2HomeItemModel e;

            public a(int i, twd0<Boolean> twd0Var, List<LobbyV2GameDetailsModel> list, l1z l1zVar, LobbyV2HomeItemModel lobbyV2HomeItemModel) {
                this.a = i;
                this.b = twd0Var;
                this.c = list;
                this.d = l1zVar;
                this.e = lobbyV2HomeItemModel;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                int iIntValue = ((Number) obj).intValue();
                if (iIntValue >= 0 && iIntValue < this.a && this.b.getValue().booleanValue()) {
                    List<LobbyV2GameDetailsModel> list = this.c;
                    LobbyV2GameDetailsModel lobbyV2GameDetailsModel = list != null ? list.get(iIntValue) : null;
                    this.d.i(lobbyV2GameDetailsModel != null ? lobbyV2GameDetailsModel.getDisplayName() : null, "game_lobby_carousal", iIntValue, this.e.getKey(), lobbyV2GameDetailsModel != null ? lobbyV2GameDetailsModel.getGameId$SGLibrary_sportybetRelease() : null);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zpz zpzVar, int i, twd0<Boolean> twd0Var, List<LobbyV2GameDetailsModel> list, l1z l1zVar, LobbyV2HomeItemModel lobbyV2HomeItemModel, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = zpzVar;
            this.c = i;
            this.d = twd0Var;
            this.e = list;
            this.f = l1zVar;
            this.i = lobbyV2HomeItemModel;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
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
                or60 or60VarC = n95.c(new o2t(this.b, 0));
                a aVar = new a(this.c, this.d, this.e, this.f, this.i);
                this.a = 1;
                if (or60VarC.collect(aVar, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2t(zpz zpzVar, int i, twd0<Boolean> twd0Var, List<LobbyV2GameDetailsModel> list, l1z l1zVar, LobbyV2HomeItemModel lobbyV2HomeItemModel, v1b<? super n2t> v1bVar) {
        super(2, v1bVar);
        this.b = zpzVar;
        this.c = i;
        this.d = twd0Var;
        this.e = list;
        this.f = l1zVar;
        this.i = lobbyV2HomeItemModel;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        n2t n2tVar = new n2t(this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
        n2tVar.a = obj;
        return n2tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((n2t) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ej5.c(v5bVar, null, null, new a(this.c, null, this.b), 3);
        ej5.c(v5bVar, null, null, new b(this.b, this.c, this.d, this.e, this.f, this.i, null), 3);
        return Unit.a;
    }
}
