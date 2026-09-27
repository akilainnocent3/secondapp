package com.applovin.impl;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class u2 extends BaseAdapter implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f29300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f29301b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f29302c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f29303d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(l2 l2Var, t2 t2Var);
    }

    public u2(Context context) {
        this.f29300a = context.getApplicationContext();
    }

    public t2 a() {
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    public abstract int b();

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t2 getItem(int i10) {
        return (t2) this.f29301b.get(i10);
    }

    public abstract List c(int i10);

    public void c() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ie
            @Override // java.lang.Runnable
            public final void run() {
                this.f27303b.notifyDataSetChanged();
            }
        });
    }

    public abstract int d(int i10);

    public abstract t2 e(int i10);

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f29301b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i10) {
        return getItem(i10).m();
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        s2 s2Var;
        t2 item = getItem(i10);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(item.j(), viewGroup, false);
            s2Var = new s2();
            s2Var.f28597a = (TextView) view.findViewById(R.id.text1);
            s2Var.f28598b = (TextView) view.findViewById(R.id.text2);
            s2Var.f28599c = (ImageView) view.findViewById(com.applovin.sdk.R.id.imageView);
            s2Var.f28600d = (ImageView) view.findViewById(com.applovin.sdk.R.id.detailImageView);
            view.setTag(s2Var);
            view.setOnClickListener(this);
            view.setBackground(a(view));
        } else {
            s2Var = (s2) view.getTag();
        }
        s2Var.a(i10);
        s2Var.a(item);
        view.setEnabled(item.o());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return t2.n();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i10) {
        return getItem(i10).o();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        int i10;
        this.f29301b = new ArrayList();
        int iB = b();
        this.f29302c = new HashMap(iB);
        t2 t2VarA = a();
        if (t2VarA != null) {
            this.f29301b.add(t2VarA);
            i10 = 1;
        } else {
            i10 = 0;
        }
        for (int i11 = 0; i11 < iB; i11++) {
            int iD = d(i11);
            if (iD != 0) {
                this.f29301b.add(e(i11));
                this.f29301b.addAll(c(i11));
                this.f29302c.put(Integer.valueOf(i11), Integer.valueOf(i10));
                i10 += iD + 1;
            }
        }
        this.f29301b.add(new x4(""));
        super.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        s2 s2Var = (s2) view.getTag();
        t2 t2VarB = s2Var.b();
        l2 l2VarA = a(s2Var.a());
        a aVar = this.f29303d;
        if (aVar == null || l2VarA == null) {
            return;
        }
        aVar.a(l2VarA, t2VarB);
    }

    public void a(a aVar) {
        this.f29303d = aVar;
    }

    private l2 a(int i10) {
        for (int i11 = 0; i11 < b(); i11++) {
            Integer num = (Integer) this.f29302c.get(Integer.valueOf(i11));
            if (num != null) {
                if (i10 <= num.intValue() + d(i11)) {
                    return new l2(i11, i10 - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    private Drawable a(View view) {
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.f29300a.getColor(com.applovin.sdk.R.color.applovin_sdk_highlightListItemColor));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], background);
        return stateListDrawable;
    }
}
