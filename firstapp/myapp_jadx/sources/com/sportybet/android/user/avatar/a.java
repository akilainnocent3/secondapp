package com.sportybet.android.user.avatar;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common_ui.widgets.CircleImageView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.user.avatar.a;
import defpackage.dzc;
import defpackage.e47;
import defpackage.sh8;
import defpackage.y37;
import defpackage.zch0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends RecyclerView.f<ViewOnClickListenerC0354a> {
    public String a;
    public final ArrayList b = new ArrayList();
    public y37 c = null;
    public final e47 d = new b() { // from class: e47
        @Override // com.sportybet.android.user.avatar.a.b
        public final void a(String str) {
            a aVar = this.a;
            aVar.a = str;
            y37 y37Var = aVar.c;
            if (y37Var != null) {
                y37Var.a(str);
            }
            aVar.notifyDataSetChanged();
        }
    };

    /* JADX INFO: renamed from: com.sportybet.android.user.avatar.a$a, reason: collision with other inner class name */
    public static class ViewOnClickListenerC0354a extends RecyclerView.d0 implements View.OnClickListener {
        public final CircleImageView a;
        public final ImageView b;
        public final b c;

        public ViewOnClickListenerC0354a(View view, e47 e47Var) {
            super(view);
            CircleImageView circleImageView = (CircleImageView) view.findViewById(R.id.avatar_circle);
            this.a = circleImageView;
            this.b = (ImageView) view.findViewById(R.id.tick_avatar);
            circleImageView.setOnClickListener(this);
            this.c = e47Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.c.a((String) this.itemView.getTag());
        }
    }

    public interface b {
        void a(String str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        ViewOnClickListenerC0354a viewOnClickListenerC0354a = (ViewOnClickListenerC0354a) d0Var;
        String str = (String) this.b.get(i);
        this.a = this.a;
        View view = viewOnClickListenerC0354a.itemView;
        ImageView imageView = viewOnClickListenerC0354a.b;
        CircleImageView circleImageView = viewOnClickListenerC0354a.a;
        view.setTag(str);
        if (TextUtils.isEmpty(this.a) || !this.a.equals(str)) {
            imageView.setVisibility(8);
            circleImageView.setBorderWidth(0);
        } else {
            imageView.setVisibility(0);
            circleImageView.setBorderWidth(zch0.a(viewOnClickListenerC0354a.itemView.getContext(), 4));
        }
        sh8.a().e(str, circleImageView, R.drawable.default_avatar, R.drawable.default_avatar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC0354a(dzc.a(viewGroup, R.layout.avatar_item, viewGroup, false), this.d);
    }
}
