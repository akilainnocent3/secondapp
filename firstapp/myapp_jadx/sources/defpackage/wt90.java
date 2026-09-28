package defpackage;

import com.sportybet.plugin.realsports.event.viewholder.SingleColumnDropdownViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wt90 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wt90(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return SingleColumnDropdownViewHolder.setupShowMoreButton$lambda$0$1((SingleColumnDropdownViewHolder) obj);
            default:
                gvi gviVar = ((vad0) obj).z;
                if (gviVar != null) {
                    gviVar.V.setVisibility(8);
                }
                return Unit.a;
        }
    }
}
