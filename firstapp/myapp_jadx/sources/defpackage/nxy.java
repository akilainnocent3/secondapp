package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportygames.compose.chat.data.model.HTTPResponse;
import com.sportygames.compose.chat.data.model.OnlineCountResponse;
import java.security.SecureRandom;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.chat.ui.OnlineCountViewModel$getOnlineCount$1", f = "OnlineCountViewModel.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
public final class nxy extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ pxy b;
    public final /* synthetic */ String c;

    public static final class a<T> implements myh {
        public final /* synthetic */ pxy a;

        public a(pxy pxyVar) {
            this.a = pxyVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            OnlineCountResponse onlineCountResponse;
            jk50 jk50Var = (jk50) obj;
            boolean z = jk50Var instanceof jk50.c;
            pxy pxyVar = this.a;
            if (z) {
                HTTPResponse hTTPResponse = ((jk50.c) jk50Var).a;
                List list = (List) hTTPResponse.getData();
                if (list == null || !(!list.isEmpty())) {
                    pxyVar.x1();
                } else {
                    List list2 = (List) hTTPResponse.getData();
                    pxyVar.getClass();
                    int onlineUserCount = 0;
                    if (list2 != null && (onlineCountResponse = (OnlineCountResponse) list2.get(0)) != null) {
                        onlineUserCount = onlineCountResponse.getOnlineUserCount();
                    }
                    double dFloor = Math.floor(new SecureRandom().nextDouble() * ((double) ((onlineUserCount * 10) / 100)));
                    wwd0 wwd0Var = pxyVar.d;
                    Long lValueOf = Long.valueOf(onlineUserCount + ((int) dFloor));
                    wwd0Var.getClass();
                    wwd0Var.k(null, lValueOf);
                }
            } else {
                if (!(jk50Var instanceof jk50.a) && !Intrinsics.g(jk50Var, jk50.b.a)) {
                    uhc.a();
                    return null;
                }
                pxyVar.x1();
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxy(pxy pxyVar, String str, v1b<? super nxy> v1bVar) {
        super(2, v1bVar);
        this.b = pxyVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nxy(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nxy) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            pxy pxyVar = this.b;
            kxy kxyVar = pxyVar.a;
            kxyVar.getClass();
            or60 or60Var = new or60(new jxy(kxyVar, this.c, null));
            a aVar = new a(pxyVar);
            this.a = 1;
            if (or60Var.collect(aVar, this) == y5bVar) {
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
