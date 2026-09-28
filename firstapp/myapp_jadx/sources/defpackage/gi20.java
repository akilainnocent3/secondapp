package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class gi20 extends x<gz4, b> {
    public static final a c = new a();
    public final md20 b;

    public static final class a extends n.e<gz4> {
        @Override // androidx.recyclerview.widget.n.e
        public final boolean areContentsTheSame(gz4 gz4Var, gz4 gz4Var2) {
            gz4 gz4Var3 = gz4Var;
            gz4 gz4Var4 = gz4Var2;
            gz4Var3.getClass();
            gz4Var4.getClass();
            return Intrinsics.g(gz4Var3, gz4Var4);
        }

        @Override // androidx.recyclerview.widget.n.e
        public final boolean areItemsTheSame(gz4 gz4Var, gz4 gz4Var2) {
            gz4 gz4Var3 = gz4Var;
            gz4 gz4Var4 = gz4Var2;
            gz4Var3.getClass();
            gz4Var4.getClass();
            return Intrinsics.g(gz4Var3.a, gz4Var4.a);
        }
    }

    public static final class b extends RecyclerView.d0 {
        public final ComposeView a;

        public b(ComposeView composeView) {
            super(composeView);
            this.a = composeView;
        }
    }

    public interface c {
        void a(int i, String str);

        void b(String str);

        void c(String str);
    }

    public gi20(md20 md20Var) {
        super(c);
        this.b = md20Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        b bVar = (b) d0Var;
        bVar.getClass();
        gz4 item = getItem(i);
        item.getClass();
        md20 md20Var = this.b;
        md20Var.getClass();
        bVar.a.setContent(new op8(-363457323, new hi20(item, md20Var), true));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        composeView.setViewCompositionStrategy(u6i0.b.a);
        return new b(composeView);
    }
}
