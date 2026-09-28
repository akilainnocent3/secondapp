package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.redblack.components.LevelIndicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class w6s extends RecyclerView.f<a> {
    public final Context a;
    public final ArrayList<LevelIndicator.a> b;
    public int c;

    public static final class a extends RecyclerView.d0 {
        public final ImageView a;

        public a(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.indicator_item);
            viewFindViewById.getClass();
            this.a = (ImageView) viewFindViewById;
        }
    }

    public w6s(Context context, ArrayList<LevelIndicator.a> arrayList) {
        context.getClass();
        arrayList.getClass();
        this.a = context;
        this.b = arrayList;
        this.c = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        a aVar = (a) d0Var;
        aVar.getClass();
        ImageView imageView = aVar.a;
        int i2 = this.c;
        int i3 = R.drawable.redblack_done_turn;
        if (i2 == 1) {
            Resources resources = imageView.getResources();
            ThreadLocal<TypedValue> threadLocal = th50.a;
            imageView.setImageDrawable(resources.getDrawable(R.drawable.redblack_done_turn, null));
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.a, R.anim.blink);
            animationLoadAnimation.getClass();
            imageView.startAnimation(animationLoadAnimation);
            return;
        }
        if (!this.b.get(i).b) {
            i3 = R.drawable.redblack_pending_turn;
        }
        Resources resources2 = imageView.getResources();
        ThreadLocal<TypedValue> threadLocal2 = th50.a;
        imageView.setImageDrawable(resources2.getDrawable(i3, null));
        imageView.clearAnimation();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewA = u540.a(viewGroup, R.layout.redblack_list_item_level, viewGroup, false);
        viewA.getClass();
        return new a(viewA);
    }
}
