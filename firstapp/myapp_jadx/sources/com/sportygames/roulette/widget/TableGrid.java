package com.sportygames.roulette.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
public class TableGrid extends FrameLayout {
    public static final int[] w = {R.drawable.sg_rut_c1, R.drawable.sg_rut_c2, R.drawable.sg_rut_c3, R.drawable.sg_rut_c4, R.drawable.sg_rut_c5};
    public final ArrayList a;
    public final TextView b;
    public final TextView c;
    public final ImageView[] d;
    public View e;
    public long f;
    public int i;
    public final LinkedList v;

    public TableGrid(Context context) {
        super(context);
        this.a = new ArrayList(5);
        this.d = new ImageView[]{(ImageView) findViewById(R.id.c1), (ImageView) findViewById(R.id.c2), (ImageView) findViewById(R.id.c3), (ImageView) findViewById(R.id.c4), (ImageView) findViewById(R.id.c5)};
        View.inflate(getContext(), R.layout.sg_rut_grid, this);
        this.b = (TextView) findViewById(R.id.bet);
        this.c = (TextView) findViewById(R.id.stake);
        this.i = R.drawable.sg_rut_press;
        this.v = new LinkedList();
    }

    public final void a(int i, long j, boolean z) {
        ArrayList arrayList = this.a;
        if (arrayList.size() >= 5) {
            arrayList.remove(0);
        }
        arrayList.add(Integer.valueOf(i));
        this.f += j;
        if (z) {
            b();
        }
    }

    public final void b() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        int i = 0;
        while (i < 5) {
            ImageView[] imageViewArr = this.d;
            if (size >= 0) {
                imageViewArr[i].setVisibility(0);
                imageViewArr[i].setImageResource(w[((Integer) arrayList.get(size)).intValue()]);
            } else {
                imageViewArr[i].setVisibility(4);
            }
            i++;
            size--;
        }
        long j = this.f;
        TextView textView = this.c;
        if (j <= 0) {
            textView.setVisibility(4);
        } else {
            textView.setVisibility(0);
            textView.setText(BigDecimal.valueOf(this.f).divide(BigDecimal.valueOf(10000L)).toString());
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        if (z && this.e == null) {
            this.e = new View(getContext());
            this.e.setLayoutParams(new FrameLayout.LayoutParams(getMeasuredWidth(), getMeasuredHeight()));
            this.e.setBackgroundResource(this.i);
            addView(this.e);
        }
        View view = this.e;
        if (view != null) {
            if (z) {
                view.setVisibility(0);
            } else {
                view.setVisibility(4);
            }
        }
        LinkedList linkedList = this.v;
        if (linkedList.size() > 0) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((TableGrid) it.next()).setPressed(z);
            }
        }
    }

    public TableGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList(5);
        this.d = new ImageView[]{(ImageView) findViewById(R.id.c1), (ImageView) findViewById(R.id.c2), (ImageView) findViewById(R.id.c3), (ImageView) findViewById(R.id.c4), (ImageView) findViewById(R.id.c5)};
        View.inflate(getContext(), R.layout.sg_rut_grid, this);
        this.b = (TextView) findViewById(R.id.bet);
        this.c = (TextView) findViewById(R.id.stake);
        this.i = R.drawable.sg_rut_press;
        this.v = new LinkedList();
    }
}
