package defpackage;

import com.sporty.android.core.model.pocket.common.ChannelAsset;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qak implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ qak(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ChannelAsset.Channel channel = (ChannelAsset.Channel) obj;
                channel.getClass();
                return new sr00.c(channel);
            default:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                pmf0[] pmf0VarArr = omf0.b;
                Function1<Object, Object> function1 = kx60.s.b;
                Boolean bool = Boolean.FALSE;
                Intrinsics.g(obj2, bool);
                omf0 omf0Var = obj2 != null ? (omf0) function1.invoke(obj2) : null;
                omf0Var.getClass();
                long j = omf0Var.a;
                Object obj3 = list.get(1);
                Intrinsics.g(obj3, bool);
                omf0 omf0Var2 = obj3 != null ? (omf0) function1.invoke(obj3) : null;
                omf0Var2.getClass();
                return new pjf0(j, omf0Var2.a);
        }
    }
}
