package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes7.dex */
public final class qo80 implements g6i0 {
    public final ConstraintLayout A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final ImageView E;
    public final TextView F;
    public final ImageView G;
    public final TextView H;
    public final ConstraintLayout a;
    public final ShapeableImageView b;
    public final TextView c;
    public final LinearLayoutCompat d;
    public final LinearLayoutCompat e;
    public final TextView f;
    public final ImageView i;
    public final ConstraintLayout v;
    public final ImageView w;
    public final ImageView y;
    public final RecyclerView z;

    public qo80(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, TextView textView, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, TextView textView2, ImageView imageView, ConstraintLayout constraintLayout2, ImageView imageView2, ImageView imageView3, RecyclerView recyclerView, ConstraintLayout constraintLayout3, TextView textView3, TextView textView4, TextView textView5, ImageView imageView4, TextView textView6, ImageView imageView5, TextView textView7) {
        this.a = constraintLayout;
        this.b = shapeableImageView;
        this.c = textView;
        this.d = linearLayoutCompat;
        this.e = linearLayoutCompat2;
        this.f = textView2;
        this.i = imageView;
        this.v = constraintLayout2;
        this.w = imageView2;
        this.y = imageView3;
        this.z = recyclerView;
        this.A = constraintLayout3;
        this.B = textView3;
        this.C = textView4;
        this.D = textView5;
        this.E = imageView4;
        this.F = textView6;
        this.G = imageView5;
        this.H = textView7;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
