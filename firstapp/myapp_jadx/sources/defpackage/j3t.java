package defpackage;

import com.sportygames.compose.lobbyv2.models.LobbyV2CategoryItemModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.components.LobbyV2CategoryDropdownComponentKt$LobbyV2CategoryDropdownComponent$2$1", f = "LobbyV2CategoryDropdownComponent.kt", l = {HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS}, m = "invokeSuspend", v = 1)
public final class j3t extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List<LobbyV2CategoryItemModel> d;
    public final /* synthetic */ zzr e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3t(boolean z, int i, List<LobbyV2CategoryItemModel> list, zzr zzrVar, v1b<? super j3t> v1bVar) {
        super(2, v1bVar);
        this.b = z;
        this.c = i;
        this.d = list;
        this.e = zzrVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new j3t(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((j3t) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i;
        y5b y5bVar = y5b.a;
        int i2 = this.a;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                if (!this.b || (i = this.c) < 0) {
                    return Unit.a;
                }
                int size = this.d.size() - 1;
                if (size < 0) {
                    return Unit.a;
                }
                zzr zzrVar = this.e;
                int iE = f.e(i, 0, size);
                this.a = 1;
                uv60 uv60Var = zzr.x;
                if (zzrVar.k(iE, 0, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.a;
    }
}
