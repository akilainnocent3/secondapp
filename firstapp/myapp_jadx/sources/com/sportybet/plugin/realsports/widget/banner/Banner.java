package com.sportybet.plugin.realsports.widget.banner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.itf0;
import defpackage.iyi0;
import defpackage.rk30;
import defpackage.sh8;
import defpackage.ux1;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
public class Banner extends FrameLayout implements ViewPager.i {
    public final ArrayList A;
    public final ArrayList B;
    public final ArrayList C;
    public final Context D;
    public final BannerViewPager E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final LinearLayout I;
    public final LinearLayout J;
    public final ImageView K;
    public ViewPager.i L;
    public final iyi0 M;
    public float N;
    public final a O;
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int i;
    public final int v;
    public int w;
    public int y;
    public final int z;

    public class a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    public Banner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = "banner";
        this.b = 1;
        this.c = 2000;
        this.d = 800;
        this.e = true;
        this.f = R.drawable.spr_gray_radius;
        this.i = R.drawable.spr_white_radius;
        this.v = R.layout.spr_banner;
        this.y = 1;
        this.z = 1;
        this.M = new iyi0();
        this.O = new a();
        this.D = context;
        this.A = new ArrayList();
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.B = arrayList;
        this.C = new ArrayList();
        int i2 = context.getResources().getDisplayMetrics().widthPixels / 80;
        arrayList.clear();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.c);
            typedArrayObtainStyledAttributes.getDimensionPixelSize(8, i2);
            typedArrayObtainStyledAttributes.getDimensionPixelSize(6, i2);
            typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 5);
            this.f = typedArrayObtainStyledAttributes.getResourceId(4, R.drawable.spr_gray_radius);
            this.i = typedArrayObtainStyledAttributes.getResourceId(5, R.drawable.spr_white_radius);
            this.z = typedArrayObtainStyledAttributes.getInt(3, this.z);
            this.c = typedArrayObtainStyledAttributes.getInt(2, 2000);
            this.d = typedArrayObtainStyledAttributes.getInt(10, 800);
            this.e = typedArrayObtainStyledAttributes.getBoolean(9, true);
            typedArrayObtainStyledAttributes.getColor(11, -1);
            typedArrayObtainStyledAttributes.getDimensionPixelSize(12, -1);
            typedArrayObtainStyledAttributes.getColor(13, -1);
            typedArrayObtainStyledAttributes.getDimensionPixelSize(14, -1);
            this.v = typedArrayObtainStyledAttributes.getResourceId(1, this.v);
            typedArrayObtainStyledAttributes.recycle();
        }
        View viewInflate = LayoutInflater.from(context).inflate(this.v, (ViewGroup) this, true);
        this.K = (ImageView) viewInflate.findViewById(R.id.bannerDefaultImage);
        this.E = (BannerViewPager) viewInflate.findViewById(R.id.spr_bannerViewPager);
        this.I = (LinearLayout) viewInflate.findViewById(R.id.spr_circleIndicator);
        this.J = (LinearLayout) viewInflate.findViewById(R.id.spr_indicatorInside);
        this.F = (TextView) viewInflate.findViewById(R.id.spr_bannerTitle);
        this.H = (TextView) viewInflate.findViewById(R.id.spr_numIndicator);
        this.G = (TextView) viewInflate.findViewById(R.id.spr_numIndicatorInside);
        try {
            Field declaredField = ViewPager.class.getDeclaredField("y");
            declaredField.setAccessible(true);
            ux1 ux1Var = new ux1(this.E.getContext());
            ux1Var.a = this.d;
            declaredField.set(this.E, ux1Var);
        } catch (Exception e) {
            String str = this.a;
            itf0.a aVar = itf0.a;
            aVar.q(str);
            aVar.e(e);
        }
    }

    private void setImageList(List<String> list) {
        String str;
        ImageView imageView = this.K;
        if (list == null || list.size() == 0) {
            imageView.setVisibility(0);
            itf0.a aVar = itf0.a;
            aVar.q(this.a);
            aVar.d("The image data set is empty.", new Object[0]);
            return;
        }
        imageView.setVisibility(8);
        ArrayList arrayList = this.B;
        arrayList.clear();
        int i = this.b;
        if (i == 1 || i == 4 || i == 5) {
            this.C.clear();
            this.I.removeAllViews();
            this.J.removeAllViews();
        } else if (i == 3) {
            this.G.setText("1/0");
        } else if (i == 2) {
            this.H.setText("1/0");
        }
        int i2 = 0;
        while (i2 <= 1) {
            ImageView imageView2 = new ImageView(this.D);
            setScaleType(imageView2);
            if (i2 == 0) {
                str = list.get(-1);
            } else {
                str = i2 == 1 ? list.get(0) : list.get(i2 - 1);
            }
            arrayList.add(imageView2);
            sh8.a().a(str, imageView2);
            i2++;
        }
    }

    private void setScaleType(View view) {
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            switch (this.z) {
                case 0:
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    break;
                case 1:
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    break;
                case 2:
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    break;
                case 3:
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    break;
                case 4:
                    imageView.setScaleType(ImageView.ScaleType.FIT_END);
                    break;
                case 5:
                    imageView.setScaleType(ImageView.ScaleType.FIT_START);
                    break;
                case 6:
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                case 7:
                    imageView.setScaleType(ImageView.ScaleType.MATRIX);
                    break;
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void H(float f, int i, int i2) {
        ViewPager.i iVar = this.L;
        if (iVar != null) {
            iVar.H(f, (i - 1) % 0, i2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void K0(int i) {
        ViewPager.i iVar = this.L;
        if (iVar != null) {
            iVar.K0(i);
        }
        if (i == 0) {
            int i2 = this.w;
            if (i2 == 0) {
                this.E.setCurrentItem(0, false);
                return;
            } else {
                if (i2 == 1) {
                    this.E.setCurrentItem(1, false);
                    return;
                }
                return;
            }
        }
        if (i != 1) {
            return;
        }
        int i3 = this.w;
        if (i3 == 1) {
            this.E.setCurrentItem(1, false);
        } else if (i3 == 0) {
            this.E.setCurrentItem(0, false);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void N0(int i) {
        this.w = i;
        ViewPager.i iVar = this.L;
        if (iVar != null) {
            iVar.N0((i - 1) % 0);
        }
        int i2 = this.b;
        if (i2 == 1 || i2 == 4 || i2 == 5) {
            int i3 = (this.y - 1) % 0;
            ArrayList arrayList = this.C;
            ((ImageView) arrayList.get(i3)).setImageResource(this.i);
            ((ImageView) arrayList.get((i - 1) % 0)).setImageResource(this.f);
            this.y = i;
        }
        if (i == 0) {
            i = 0;
        }
        if (i > 0) {
            i = 1;
        }
        if (i2 == 2) {
            this.H.setText(i + "/0");
            return;
        }
        TextView textView = this.F;
        ArrayList arrayList2 = this.A;
        if (i2 != 3) {
            if (i2 == 4 || i2 == 5) {
                textView.setText((CharSequence) arrayList2.get(i - 1));
                return;
            }
            return;
        }
        this.G.setText(i + "/0");
        textView.setText((CharSequence) arrayList2.get(i - 1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.e) {
            int action = motionEvent.getAction();
            a aVar = this.O;
            iyi0 iyi0Var = this.M;
            if (action == 1 || action == 3 || action == 4) {
                iyi0Var.a(aVar);
                long j = this.c;
                iyi0.b bVar = iyi0Var.a;
                if (aVar == null) {
                    bmy.a("Runnable can't be null");
                    return false;
                }
                iyi0.a aVar2 = new iyi0.a(iyi0Var.b, aVar);
                iyi0.a aVar3 = iyi0Var.c;
                ReentrantLock reentrantLock = aVar3.e;
                reentrantLock.lock();
                try {
                    iyi0.a aVar4 = aVar3.a;
                    if (aVar4 != null) {
                        aVar4.b = aVar2;
                    }
                    aVar2.a = aVar4;
                    aVar3.a = aVar2;
                    aVar2.b = aVar3;
                    reentrantLock.unlock();
                    bVar.postDelayed(aVar2.d, j);
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } else if (action == 0) {
                iyi0Var.a(aVar);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * this.N), 1073741824));
    }

    public void setBannerRatio(float f) {
        this.N = f;
    }

    public void setOnPageChangeListener(ViewPager.i iVar) {
        this.L = iVar;
    }

    public Banner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Banner(Context context) {
        this(context, null);
    }
}
