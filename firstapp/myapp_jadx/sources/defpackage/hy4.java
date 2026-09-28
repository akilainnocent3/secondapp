package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.plugin.realsports.event.viewholder.SingleColumnDropdownViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class hy4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView.d0 b;

    public /* synthetic */ hy4(RecyclerView.d0 d0Var, int i) {
        this.a = i;
        this.b = d0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        RecyclerView.d0 d0Var = this.b;
        switch (i) {
            case 0:
                ky4 ky4Var = (ky4) d0Var;
                ky4Var.b.invoke(Integer.valueOf(ky4Var.getBindingAdapterPosition()));
                return Unit.a;
            default:
                return SingleColumnDropdownViewHolder.inflater_delegate$lambda$0((SingleColumnDropdownViewHolder) d0Var);
        }
    }
}
