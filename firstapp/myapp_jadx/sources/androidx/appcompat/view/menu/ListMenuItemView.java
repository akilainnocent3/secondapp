package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import defpackage.dl30;
import defpackage.fyf0;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {
    public final Context A;
    public boolean B;
    public final Drawable C;
    public final boolean D;
    public LayoutInflater E;
    public boolean F;
    public h a;
    public ImageView b;
    public RadioButton c;
    public TextView d;
    public CheckBox e;
    public TextView f;
    public ImageView i;
    public ImageView v;
    public LinearLayout w;
    public final Drawable y;
    public final int z;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        fyf0 fyf0VarF = fyf0.f(getContext(), attributeSet, dl30.t, i);
        this.y = fyf0VarF.b(5);
        TypedArray typedArray = fyf0VarF.b;
        this.z = typedArray.getResourceId(1, -1);
        this.B = typedArray.getBoolean(7, false);
        this.A = context;
        this.C = fyf0VarF.b(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, com.sportybet.android.gp.tz.R.attr.dropDownListViewStyle, 0);
        this.D = typedArrayObtainStyledAttributes.hasValue(0);
        fyf0VarF.g();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        LayoutInflater layoutInflater = this.E;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        this.E = layoutInflaterFrom;
        return layoutInflaterFrom;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.v;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.v.getLayoutParams();
        rect.top = this.v.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void c(h hVar) {
        this.a = hVar;
        boolean zIsVisible = hVar.isVisible();
        f fVar = hVar.n;
        boolean z = false;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(hVar.e);
        setCheckable(hVar.isCheckable());
        if (fVar.q()) {
            if ((fVar.p() ? hVar.j : hVar.h) != 0) {
                z = true;
            }
        }
        setShortcut(z, fVar.p() ? hVar.j : hVar.h);
        setIcon(hVar.getIcon());
        setEnabled(hVar.isEnabled());
        setSubMenuArrowVisible(hVar.hasSubMenu());
        setContentDescription(hVar.q);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.y);
        TextView textView = (TextView) findViewById(com.sportybet.android.gp.tz.R.id.title);
        this.d = textView;
        int i = this.z;
        if (i != -1) {
            textView.setTextAppearance(this.A, i);
        }
        this.f = (TextView) findViewById(com.sportybet.android.gp.tz.R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(com.sportybet.android.gp.tz.R.id.submenuarrow);
        this.i = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.C);
        }
        this.v = (ImageView) findViewById(com.sportybet.android.gp.tz.R.id.group_divider);
        this.w = (LinearLayout) findViewById(com.sportybet.android.gp.tz.R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.b != null && this.B) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        CompoundButton compoundButton3;
        if (!z && this.c == null && this.e == null) {
            return;
        }
        if ((this.a.x & 4) != 0) {
            if (this.c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(com.sportybet.android.gp.tz.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.c = radioButton;
                LinearLayout linearLayout = this.w;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
            compoundButton2 = this.e;
            compoundButton3 = compoundButton2;
        } else {
            if (this.e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(com.sportybet.android.gp.tz.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.e = checkBox;
                LinearLayout linearLayout2 = this.w;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.e;
            compoundButton2 = this.c;
            compoundButton3 = compoundButton;
        }
        if (!z) {
            if (compoundButton3 != null) {
                compoundButton3.setVisibility(8);
            }
            RadioButton radioButton2 = this.c;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
                return;
            }
            return;
        }
        compoundButton.setChecked(this.a.isChecked());
        if (compoundButton.getVisibility() != 0) {
            compoundButton.setVisibility(0);
        }
        if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
            return;
        }
        compoundButton2.setVisibility(8);
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.a.x & 4) != 0) {
            if (this.c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(com.sportybet.android.gp.tz.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.c = radioButton;
                LinearLayout linearLayout = this.w;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
        } else {
            if (this.e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(com.sportybet.android.gp.tz.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.e = checkBox;
                LinearLayout linearLayout2 = this.w;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.F = z;
        this.B = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.v;
        if (imageView != null) {
            imageView.setVisibility((this.D || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        f fVar = this.a.n;
        boolean z = this.F;
        if (z || this.B) {
            ImageView imageView = this.b;
            if (imageView == null && drawable == null && !this.B) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(com.sportybet.android.gp.tz.R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.b = imageView2;
                LinearLayout linearLayout = this.w;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.B) {
                this.b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.b;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.b.getVisibility() != 0) {
                this.b.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    public void setShortcut(boolean z, char c) {
        int i;
        String string;
        if (z) {
            h hVar = this.a;
            f fVar = hVar.n;
            if (fVar.q()) {
                if ((fVar.p() ? hVar.j : hVar.h) != 0) {
                    i = 0;
                } else {
                    i = 8;
                }
            } else {
                i = 8;
            }
        } else {
            i = 8;
        }
        if (i == 0) {
            TextView textView = this.f;
            h hVar2 = this.a;
            f fVar2 = hVar2.n;
            Context context = fVar2.a;
            char c2 = fVar2.p() ? hVar2.j : hVar2.h;
            if (c2 == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(com.sportybet.android.gp.tz.R.string.abc_prepend_shortcut_label));
                }
                int i2 = fVar2.p() ? hVar2.k : hVar2.i;
                h.c(i2, 65536, resources.getString(com.sportybet.android.gp.tz.R.string.abc_menu_meta_shortcut_label), sb);
                h.c(i2, 4096, resources.getString(com.sportybet.android.gp.tz.R.string.abc_menu_ctrl_shortcut_label), sb);
                h.c(i2, 2, resources.getString(com.sportybet.android.gp.tz.R.string.abc_menu_alt_shortcut_label), sb);
                h.c(i2, 1, resources.getString(com.sportybet.android.gp.tz.R.string.abc_menu_shift_shortcut_label), sb);
                h.c(i2, 4, resources.getString(com.sportybet.android.gp.tz.R.string.abc_menu_sym_shortcut_label), sb);
                h.c(i2, 8, resources.getString(com.sportybet.android.gp.tz.R.string.abc_menu_function_shortcut_label), sb);
                if (c2 == '\b') {
                    sb.append(resources.getString(com.sportybet.android.gp.tz.R.string.abc_menu_delete_shortcut_label));
                } else if (c2 == '\n') {
                    sb.append(resources.getString(com.sportybet.android.gp.tz.R.string.abc_menu_enter_shortcut_label));
                } else if (c2 != ' ') {
                    sb.append(c2);
                } else {
                    sb.append(resources.getString(com.sportybet.android.gp.tz.R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f.getVisibility() != i) {
            this.f.setVisibility(i);
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.d;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.d.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.sportybet.android.gp.tz.R.attr.listMenuViewStyle);
    }
}
