package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.components.LobbyV2SearchBarComponentKt$LobbyV2SearchBarComponent$2$1$1$1", f = "LobbyV2SearchBarComponent.kt", l = {}, m = "invokeSuspend", v = 1)
public final class t8t extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ b5i a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8t(b5i b5iVar, v1b<? super t8t> v1bVar) {
        super(2, v1bVar);
        this.a = b5iVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new t8t(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t8t) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        b5i.b(this.a);
        return Unit.a;
    }
}
