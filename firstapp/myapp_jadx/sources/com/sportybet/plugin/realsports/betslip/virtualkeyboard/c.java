package com.sportybet.plugin.realsports.betslip.virtualkeyboard;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.c;
import defpackage.dzc;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends RecyclerView.f<a> {
    public final ArrayList a;
    public final boolean b;
    public b c;

    public static final class a extends RecyclerView.d0 {
        public final TextView a;
        public final ImageView b;

        public a(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.tv_key);
            viewFindViewById.getClass();
            this.a = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.rl_del);
            viewFindViewById2.getClass();
            this.b = (ImageView) viewFindViewById2;
        }
    }

    public interface b {
        void b(View view, RecyclerView.d0 d0Var);

        void e(View view, RecyclerView.d0 d0Var, int i);

        void s(View view, RecyclerView.d0 d0Var);
    }

    public c(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        a aVar = (a) d0Var;
        aVar.getClass();
        TextView textView = aVar.a;
        if (i != 6) {
            textView.setText((CharSequence) this.a.get(i));
        } else {
            aVar.b.setVisibility(0);
            textView.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewA = dzc.a(viewGroup, this.b ? R.layout.spr_item_bigger_key_board : R.layout.spr_item_key_board, viewGroup, false);
        viewA.getClass();
        final a aVar = new a(viewA);
        aVar.a.setOnClickListener(new View.OnClickListener() { // from class: vnp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.b bVar = this.a.c;
                if (bVar != null) {
                    view.getClass();
                    c.a aVar2 = aVar;
                    bVar.e(view, aVar2, aVar2.getBindingAdapterPosition());
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: xnp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.b bVar = this.a.c;
                if (bVar != null) {
                    view.getClass();
                    c.a aVar2 = aVar;
                    aVar2.getBindingAdapterPosition();
                    bVar.b(view, aVar2);
                }
            }
        };
        ImageView imageView = aVar.b;
        imageView.setOnClickListener(onClickListener);
        imageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: znp
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                c.b bVar = this.a.c;
                if (bVar == null) {
                    return false;
                }
                view.getClass();
                c.a aVar2 = aVar;
                aVar2.getBindingAdapterPosition();
                bVar.s(view, aVar2);
                return false;
            }
        });
        return aVar;
    }
}
