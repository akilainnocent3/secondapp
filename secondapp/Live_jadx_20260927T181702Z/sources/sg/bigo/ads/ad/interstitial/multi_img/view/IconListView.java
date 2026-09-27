package sg.bigo.ads.ad.interstitial.multi_img.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.b.e;
import sg.bigo.ads.ad.interstitial.f;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public class IconListView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f132094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<a> f132095b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f132096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f132097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f132098c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final LinearLayout f132099d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f132100e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ImageView f132101f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final LinearLayout f132102g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TextView f132103h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ImageView f132104i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final f.a f132105j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f132106k;

        public a(Context context, f.a aVar, String str, boolean z10) {
            this.f132096a = context;
            View viewA = sg.bigo.ads.common.utils.a.a(context, R.layout.bigo_ad_layout_ic_item, null, false);
            this.f132097b = viewA;
            this.f132098c = z10;
            LinearLayout linearLayout = (LinearLayout) viewA.findViewById(R.id.bigo_ad_ic_title_layout);
            this.f132099d = linearLayout;
            this.f132100e = (TextView) viewA.findViewById(R.id.bigo_ad_ic_title_txt);
            this.f132101f = (ImageView) viewA.findViewById(R.id.bigo_ad_ic_title_iv);
            linearLayout.setTag(26);
            LinearLayout linearLayout2 = (LinearLayout) viewA.findViewById(R.id.bigo_ad_ic_desc_layout);
            this.f132102g = linearLayout2;
            this.f132103h = (TextView) viewA.findViewById(R.id.bigo_ad_ic_desc_txt);
            this.f132104i = (ImageView) viewA.findViewById(R.id.bigo_ad_ic_desc_iv);
            linearLayout2.setTag(26);
            this.f132105j = aVar;
            this.f132106k = str;
            a();
        }

        public void a() {
            if (this.f132105j.f131827r == 0) {
                this.f132100e.setVisibility(8);
            } else {
                this.f132100e.setVisibility(0);
                this.f132100e.setText(this.f132105j.f131827r);
                if (this.f132098c) {
                    this.f132100e.setTextColor(-1);
                }
            }
            if (this.f132105j.f131828s == 0) {
                this.f132101f.setVisibility(8);
            } else {
                this.f132101f.setVisibility(0);
                this.f132101f.setImageResource(this.f132105j.f131828s);
            }
            if (this.f132105j.f131829t == 0) {
                this.f132103h.setVisibility(8);
            } else {
                this.f132103h.setVisibility(0);
                this.f132103h.setText(this.f132105j.f131829t);
                if (this.f132098c) {
                    this.f132103h.setTextColor(q.b("#9AFFFFFF", -1));
                }
            }
            if (this.f132105j.f131830u == 0) {
                this.f132104i.setVisibility(8);
            } else {
                this.f132104i.setVisibility(0);
                this.f132104i.setImageResource(this.f132105j.f131830u);
            }
        }
    }

    public static class b extends a {
        public b(Context context, f.a aVar, String str, boolean z10) {
            super(context, aVar, str, z10);
        }

        @Override // sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a
        public final void a() {
            this.f132100e.setVisibility(0);
            this.f132100e.setText(sg.bigo.ads.common.utils.a.a(this.f132096a, this.f132105j.f131827r, e.a(this.f132106k)));
            if (this.f132098c) {
                this.f132100e.setTextColor(-1);
            }
            this.f132101f.setVisibility(8);
            this.f132103h.setVisibility(0);
            this.f132103h.setText(this.f132105j.f131829t);
            if (this.f132098c) {
                this.f132103h.setTextColor(q.b("#9AFFFFFF", -1));
            }
            this.f132104i.setVisibility(8);
        }
    }

    public static class c extends a {
        public c(Context context, f.a aVar, String str, boolean z10) {
            super(context, aVar, str, z10);
        }

        @Override // sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a
        public final void a() {
            this.f132100e.setVisibility(8);
            this.f132101f.setVisibility(0);
            this.f132101f.setImageResource(this.f132105j.f131828s);
            this.f132103h.setVisibility(0);
            this.f132103h.setText(this.f132105j.f131829t);
            if (this.f132098c) {
                this.f132103h.setTextColor(q.b("#9AFFFFFF", -1));
            }
            this.f132104i.setVisibility(0);
            this.f132104i.setImageResource(this.f132105j.f131830u);
        }
    }

    public static class d extends a {
        public d(Context context, f.a aVar, String str, boolean z10) {
            super(context, aVar, str, z10);
        }

        @Override // sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a
        public final void a() {
            this.f132100e.setVisibility(0);
            this.f132100e.setText(sg.bigo.ads.common.utils.a.a(this.f132096a, this.f132105j.f131827r, e.c(this.f132106k)));
            if (this.f132098c) {
                this.f132100e.setTextColor(-1);
            }
            this.f132101f.setVisibility(0);
            this.f132101f.setImageResource(this.f132105j.f131828s);
            this.f132103h.setVisibility(0);
            this.f132103h.setText(e.b(this.f132106k) + " " + sg.bigo.ads.common.utils.a.a(this.f132096a, this.f132105j.f131829t, new Object[0]));
            if (this.f132098c) {
                this.f132103h.setTextColor(q.b("#9AFFFFFF", -1));
            }
            this.f132104i.setVisibility(8);
        }
    }

    public IconListView(Context context) {
        this(context, null);
    }

    private List<a> a(Context context, int i10, String str) {
        d dVar;
        c cVar;
        ArrayList arrayList = new ArrayList();
        if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 8) {
            List<f.a> listA = f.a.a(i10);
            Random random = new Random();
            while (!listA.isEmpty()) {
                arrayList.add(new a(context, listA.remove(random.nextInt(listA.size())), str, this.f132094a));
            }
            return arrayList;
        }
        boolean z10 = this.f132094a;
        if (z10) {
            dVar = new d(context, f.a.STAR_WHITE, str, z10);
            arrayList.add(dVar);
            arrayList.add(new b(context, f.a.DOWNLOAD_NUM_WHITE, str, this.f132094a));
            cVar = new c(context, f.a.Everyone_WHITE, str, this.f132094a);
        } else {
            dVar = new d(context, f.a.STAR, str, z10);
            arrayList.add(dVar);
            arrayList.add(new b(context, f.a.DOWNLOAD_NUM, str, this.f132094a));
            cVar = new c(context, f.a.Everyone, str, this.f132094a);
        }
        arrayList.add(cVar);
        return arrayList;
    }

    public List<a> getItems() {
        return this.f132095b;
    }

    public void setThemeWhite(boolean z10) {
        this.f132094a = z10;
    }

    public IconListView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0041  */
    /* JADX WARN: Code duplicated, block: B:43:0x0067  */
    /* JADX WARN: Code duplicated, block: B:46:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0072  */
    /* JADX WARN: Code duplicated, block: B:49:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x007d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public final void a(f fVar) {
        List<a> listA;
        int i10;
        int i11;
        removeAllViews();
        if (fVar == null) {
            return;
        }
        Context context = getContext();
        int i12 = fVar.f131805a;
        if (i12 != 1) {
            int i13 = 4;
            if (i12 != 2) {
                if (i12 == 3) {
                    if (fVar.f131808d) {
                        i13 = this.f132094a ? 8 : 2;
                    } else if (!this.f132094a) {
                        i13 = 1;
                    }
                    listA = a(context, i13, fVar.f131807c);
                } else if (i12 != 4 || !fVar.f131808d) {
                    return;
                } else {
                    listA = a(context, this.f132094a ? 8 : 2, fVar.f131807c);
                }
            } else if (!fVar.f131808d) {
                if (!this.f132094a) {
                    i13 = 1;
                }
                listA = a(context, i13, fVar.f131807c);
            }
            this.f132095b = listA;
            if (k.a((Collection) this.f132095b)) {
                return;
            }
            for (i10 = 0; i10 < this.f132095b.size(); i10++) {
                if (i10 > 0) {
                    Context context2 = getContext();
                    if (this.f132094a) {
                        i11 = R.layout.bigo_ad_layout_space;
                    } else {
                        i11 = R.layout.bigo_ad_layout_space_black;
                    }
                    sg.bigo.ads.common.utils.a.a(context2, i11, this, true);
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
                layoutParams.weight = 1.0f;
                addView(this.f132095b.get(i10).f132097b, layoutParams);
            }
        }
        if (!fVar.f131808d) {
            return;
        }
        listA = a(context, 0, fVar.f131807c);
        this.f132095b = listA;
        if (k.a((Collection) this.f132095b)) {
            return;
        }
        while (i10 < this.f132095b.size()) {
            if (i10 > 0) {
                Context context3 = getContext();
                if (this.f132094a) {
                    i11 = R.layout.bigo_ad_layout_space;
                } else {
                    i11 = R.layout.bigo_ad_layout_space_black;
                }
                sg.bigo.ads.common.utils.a.a(context3, i11, this, true);
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
            layoutParams2.weight = 1.0f;
            addView(this.f132095b.get(i10).f132097b, layoutParams2);
        }
    }

    public IconListView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f132094a = false;
        setOrientation(0);
        setGravity(17);
    }
}
