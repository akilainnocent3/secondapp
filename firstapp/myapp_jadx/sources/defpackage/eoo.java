package defpackage;

import com.sportybet.android.instantwin.presentation.ticketdetail.b;
import com.sportybet.plugin.sportystories.domain.entity.Story;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eoo implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eoo(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                v4f v4fVar = (v4f) obj;
                v4fVar.getClass();
                ((Function1) obj2).invoke(new b.c.C0344b(v4fVar));
                return Unit.a;
            default:
                return ((Story) ((List) obj2).get(((Integer) obj).intValue())).getStoryId();
        }
    }
}
