package com.sportygames.sportysoccer.virtualkeyboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.sportysoccer.virtualkeyboard.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends RecyclerView.f<C0450a> {
    public final Context a;
    public final List<String> b;
    public b c;
    public final boolean d;

    /* JADX INFO: renamed from: com.sportygames.sportysoccer.virtualkeyboard.a$a, reason: collision with other inner class name */
    public static class C0450a extends RecyclerView.d0 {
        public final TextView a;
        public final ImageView b;

        public C0450a(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.tv_key);
            this.b = (ImageView) view.findViewById(R.id.rl_del);
        }
    }

    public interface b {
        void a();

        void b(int i);

        void c();
    }

    public a(Context context, ArrayList arrayList, boolean z) {
        this.a = context;
        this.b = arrayList;
        this.d = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        List<String> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        C0450a c0450a = (C0450a) d0Var;
        if (i != 6) {
            c0450a.a.setText(this.b.get(i));
        } else {
            c0450a.b.setVisibility(0);
            c0450a.a.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        final C0450a c0450a = new C0450a(LayoutInflater.from(this.a).inflate(this.d ? R.layout.sg_spr_item_bigger_key_board : R.layout.sg_spr_item_key_board, viewGroup, false));
        c0450a.a.setOnClickListener(new View.OnClickListener() { // from class: unp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.b bVar = this.a.c;
                if (bVar != null) {
                    bVar.b(c0450a.getAdapterPosition());
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: wnp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.b bVar = this.a.c;
                if (bVar != null) {
                    c0450a.getAdapterPosition();
                    bVar.a();
                }
            }
        };
        ImageView imageView = c0450a.b;
        imageView.setOnClickListener(onClickListener);
        imageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: ynp
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                a.b bVar = this.a.c;
                if (bVar == null) {
                    return false;
                }
                c0450a.getAdapterPosition();
                bVar.c();
                return false;
            }
        });
        return c0450a;
    }
}
