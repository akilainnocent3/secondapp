package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import defpackage.bkg0;
import defpackage.eid;
import defpackage.jjg0;
import defpackage.mjg0;
import defpackage.pcn;
import defpackage.qjg0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {
    public static final /* synthetic */ int B = 0;
    public boolean A;
    public final int a;
    public final LayoutInflater b;
    public final CheckedTextView c;
    public final CheckedTextView d;
    public final a e;
    public final ArrayList f;
    public final HashMap i;
    public boolean v;
    public boolean w;
    public mjg0 y;
    public CheckedTextView[][] z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = TrackSelectionView.B;
            TrackSelectionView trackSelectionView = TrackSelectionView.this;
            HashMap map = trackSelectionView.i;
            boolean z = true;
            if (view == trackSelectionView.c) {
                trackSelectionView.A = true;
                map.clear();
            } else if (view == trackSelectionView.d) {
                trackSelectionView.A = false;
                map.clear();
            } else {
                trackSelectionView.A = false;
                Object tag = view.getTag();
                tag.getClass();
                b bVar = (b) tag;
                bkg0.a aVar = bVar.a;
                jjg0 jjg0Var = aVar.b;
                int i2 = bVar.b;
                qjg0 qjg0Var = (qjg0) map.get(jjg0Var);
                if (qjg0Var == null) {
                    if (!trackSelectionView.w && !map.isEmpty()) {
                        map.clear();
                    }
                    map.put(jjg0Var, new qjg0(jjg0Var, pcn.n(Integer.valueOf(i2))));
                } else {
                    ArrayList arrayList = new ArrayList(qjg0Var.b);
                    boolean zIsChecked = ((CheckedTextView) view).isChecked();
                    boolean z2 = trackSelectionView.v && aVar.c;
                    if (!z2 && (!trackSelectionView.w || trackSelectionView.f.size() <= 1)) {
                        z = false;
                    }
                    if (zIsChecked && z) {
                        arrayList.remove(Integer.valueOf(i2));
                        if (arrayList.isEmpty()) {
                            map.remove(jjg0Var);
                        } else {
                            map.put(jjg0Var, new qjg0(jjg0Var, arrayList));
                        }
                    } else if (!zIsChecked) {
                        if (z2) {
                            arrayList.add(Integer.valueOf(i2));
                            map.put(jjg0Var, new qjg0(jjg0Var, arrayList));
                        } else {
                            map.put(jjg0Var, new qjg0(jjg0Var, pcn.n(Integer.valueOf(i2))));
                        }
                    }
                }
            }
            trackSelectionView.a();
        }
    }

    public static final class b {
        public final bkg0.a a;
        public final int b;

        public b(bkg0.a aVar, int i) {
            this.a = aVar;
            this.b = i;
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.b = layoutInflaterFrom;
        a aVar = new a();
        this.e = aVar;
        this.y = new eid(getResources());
        this.f = new ArrayList();
        this.i = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.sportybet.android.gp.tz.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(aVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(com.sportybet.android.gp.tz.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.sportybet.android.gp.tz.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(aVar);
        addView(checkedTextView2);
    }

    public final void a() {
        this.c.setChecked(this.A);
        boolean z = this.A;
        HashMap map = this.i;
        this.d.setChecked(!z && map.isEmpty());
        for (int i = 0; i < this.z.length; i++) {
            qjg0 qjg0Var = (qjg0) map.get(((bkg0.a) this.f.get(i)).b);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.z[i];
                if (i2 < checkedTextViewArr.length) {
                    if (qjg0Var != null) {
                        Object tag = checkedTextViewArr[i2].getTag();
                        tag.getClass();
                        this.z[i][i2].setChecked(qjg0Var.b.contains(Integer.valueOf(((b) tag).b)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    public final void b() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.d;
        CheckedTextView checkedTextView2 = this.c;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.z = new CheckedTextView[arrayList.size()][];
        boolean z = this.w && arrayList.size() > 1;
        for (int i = 0; i < arrayList.size(); i++) {
            bkg0.a aVar = (bkg0.a) arrayList.get(i);
            boolean z2 = this.v && aVar.c;
            CheckedTextView[][] checkedTextViewArr = this.z;
            int i2 = aVar.a;
            checkedTextViewArr[i] = new CheckedTextView[i2];
            b[] bVarArr = new b[i2];
            for (int i3 = 0; i3 < aVar.a; i3++) {
                bVarArr[i3] = new b(aVar, i3);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                LayoutInflater layoutInflater = this.b;
                if (i4 == 0) {
                    addView(layoutInflater.inflate(com.sportybet.android.gp.tz.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z2 || z) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.a);
                mjg0 mjg0Var = this.y;
                b bVar = bVarArr[i4];
                checkedTextView3.setText(mjg0Var.a(bVar.a.b.d[bVar.b]));
                checkedTextView3.setTag(bVarArr[i4]);
                if (aVar.a(i4)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.e);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.z[i][i4] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.A;
    }

    public Map<jjg0, qjg0> getOverrides() {
        return this.i;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.v != z) {
            this.v = z;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.w != z) {
            this.w = z;
            if (!z) {
                HashMap map = this.i;
                if (map.size() > 1) {
                    HashMap map2 = new HashMap();
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = this.f;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        qjg0 qjg0Var = (qjg0) map.get(((bkg0.a) arrayList.get(i)).b);
                        if (qjg0Var != null && map2.isEmpty()) {
                            map2.put(qjg0Var.a, qjg0Var);
                        }
                        i++;
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(mjg0 mjg0Var) {
        mjg0Var.getClass();
        this.y = mjg0Var;
        b();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }
}
