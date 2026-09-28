package com.sportybet.plugin.webcontainer.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.utils.Tools;
import defpackage.gr0;
import defpackage.sn5;

/* JADX INFO: loaded from: classes7.dex */
public class CustomAlertDialog extends Dialog implements View.OnClickListener {
    private BaseAdapter adapter;
    private int backgroundId;
    private View customView;
    private int gravity;
    private Drawable icon;
    private ListView listView;
    private CharSequence message;
    private Button negativeButton;
    private DialogInterface.OnClickListener negativeButtonListener;
    private CharSequence negativeButtonText;
    private Button neutralButton;
    private DialogInterface.OnClickListener neutralButtonListener;
    private CharSequence neutralButtonText;
    private Button positiveButton;
    private DialogInterface.OnClickListener positiveButtonListener;
    private CharSequence positiveButtonText;
    private CharSequence title;
    private Window window;

    public CustomAlertDialog(Context context) {
        super(context, R.style.web_AlertDialogStyle);
        this.backgroundId = -1;
        this.gravity = 17;
        init();
    }

    private void setupButtons(LinearLayout linearLayout) {
        if (this.positiveButtonText != null) {
            Button button = (Button) linearLayout.findViewById(R.id.positiveButton);
            this.positiveButton = button;
            button.setText(this.positiveButtonText);
            this.positiveButton.setOnClickListener(this);
            this.positiveButton.setVisibility(0);
            linearLayout.setVisibility(0);
        }
        if (this.negativeButtonText != null) {
            Button button2 = (Button) linearLayout.findViewById(R.id.negativeButton);
            this.negativeButton = button2;
            button2.setText(this.negativeButtonText);
            this.negativeButton.setOnClickListener(this);
            this.negativeButton.setVisibility(0);
            linearLayout.setVisibility(0);
        }
        if (this.neutralButtonText != null) {
            Button button3 = (Button) linearLayout.findViewById(R.id.neutralButton);
            this.neutralButton = button3;
            button3.setText(this.neutralButtonText);
            this.neutralButton.setOnClickListener(this);
            this.neutralButton.setVisibility(0);
            linearLayout.setVisibility(0);
        }
    }

    private void setupContent(LinearLayout linearLayout) {
        if (this.message != null) {
            ((TextView) linearLayout.findViewById(R.id.message)).setText(this.message);
            linearLayout.setVisibility(0);
            return;
        }
        if (this.listView != null) {
            linearLayout.setVisibility(0);
            View viewFindViewById = this.window.findViewById(R.id.scrollView);
            viewFindViewById.setVisibility(8);
            View decorView = this.window.getDecorView();
            int pixelByDip = Tools.getPixelByDip(getContext(), 50);
            decorView.setPadding(pixelByDip, 0, pixelByDip, 0);
            linearLayout.removeView(viewFindViewById);
            linearLayout.addView(this.listView, new LinearLayout.LayoutParams(-1, -1));
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
            BaseAdapter baseAdapter = this.adapter;
            if (baseAdapter != null) {
                this.listView.setAdapter((ListAdapter) baseAdapter);
            }
        }
    }

    private void setupCustomView(FrameLayout frameLayout) {
        if (this.customView != null) {
            ((FrameLayout) frameLayout.findViewById(R.id.custom)).addView(this.customView, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.setVisibility(0);
        }
    }

    private void setupTitle(LinearLayout linearLayout) {
        if (this.icon != null) {
            ((ImageView) linearLayout.findViewById(R.id.icon)).setImageDrawable(this.icon);
            linearLayout.setVisibility(0);
        }
        if (this.title != null) {
            ((TextView) linearLayout.findViewById(R.id.title)).setText(this.title);
            linearLayout.setVisibility(0);
        }
    }

    private void setupView() {
        if (this.backgroundId >= 0) {
            this.window.findViewById(R.id.parentPanel).setBackgroundResource(this.backgroundId);
        }
        setupTitle((LinearLayout) this.window.findViewById(R.id.title_panel));
        setupContent((LinearLayout) this.window.findViewById(R.id.contentPanel));
        setupButtons((LinearLayout) this.window.findViewById(R.id.buttonPanel));
        setupCustomView((FrameLayout) this.window.findViewById(R.id.customPanel));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public void dispose() {
        dismiss();
    }

    public int getGravity() {
        return this.gravity;
    }

    public void init() {
        this.window = getWindow();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        DialogInterface.OnClickListener onClickListener;
        if (view.getId() == R.id.positiveButton) {
            DialogInterface.OnClickListener onClickListener2 = this.positiveButtonListener;
            if (onClickListener2 != null) {
                onClickListener2.onClick(this, -1);
            }
        } else if (view.getId() == R.id.negativeButton) {
            DialogInterface.OnClickListener onClickListener3 = this.negativeButtonListener;
            if (onClickListener3 != null) {
                onClickListener3.onClick(this, -2);
            }
        } else if (view.getId() == R.id.neutralButton && (onClickListener = this.neutralButtonListener) != null) {
            onClickListener.onClick(this, -3);
        }
        dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.window.setContentView(R.layout.web_alert_dialog);
        setupView();
    }

    public void setBackground(int i) {
        this.backgroundId = i;
    }

    public void setGravity(int i) {
        this.gravity = i;
    }

    public void setIcon(Drawable drawable) {
        this.icon = drawable;
    }

    public void setMessage(CharSequence charSequence) {
        this.message = charSequence;
    }

    public void setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        if (charSequence != null) {
            this.negativeButtonText = charSequence;
            this.negativeButtonListener = onClickListener;
        }
    }

    public void setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        if (charSequence != null) {
            this.neutralButtonText = charSequence;
            this.neutralButtonListener = onClickListener;
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        Window window = this.window;
        if (window != null) {
            window.getDecorView().setPadding(i, i2, i3, i4);
        }
    }

    public void setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        if (charSequence != null) {
            this.positiveButtonText = charSequence;
            this.positiveButtonListener = onClickListener;
        }
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        setTitle(sn5.b(getContext(), i, new Object[0]));
    }

    public void setView(View view) {
        this.customView = view;
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            this.window.setGravity(this.gravity);
            super.show();
        } catch (Exception unused) {
        }
    }

    public void setIcon(int i) {
    }

    public static class Builder {
        private Context context;
        protected Params p;

        public static class Params {
            public int backgroundId = -1;
            public boolean cancelable = true;
            public final Context context;
            public Drawable icon;
            public final LayoutInflater inflater;
            public CharSequence[] items;
            public CharSequence message;
            public DialogInterface.OnClickListener negativeButtonListener;
            public CharSequence negativeButtonText;
            public DialogInterface.OnClickListener neutralButtonListener;
            public CharSequence neutralButtonText;
            public DialogInterface.OnCancelListener onCancelListener;
            public DialogInterface.OnClickListener onClickListener;
            public DialogInterface.OnKeyListener onKeyListener;
            public DialogInterface.OnClickListener positiveButtonListener;
            public CharSequence positiveButtonText;
            public CharSequence title;
            public View view;

            public Params(Context context) {
                this.context = context;
                this.inflater = (LayoutInflater) context.getSystemService("layout_inflater");
            }

            private void createListView(CustomAlertDialog customAlertDialog) {
                ListView listView = (ListView) this.inflater.inflate(R.layout.web_alert_dialog_listview, (ViewGroup) null);
                PopupListAdapter popupListAdapter = new PopupListAdapter(this.context, this.items, customAlertDialog);
                customAlertDialog.adapter = popupListAdapter;
                popupListAdapter.setOnClickListener(this.onClickListener);
                customAlertDialog.listView = listView;
            }

            public void apply(CustomAlertDialog customAlertDialog) {
                DialogInterface.OnKeyListener onKeyListener = this.onKeyListener;
                if (onKeyListener != null) {
                    customAlertDialog.setOnKeyListener(onKeyListener);
                }
                int i = this.backgroundId;
                if (i >= 0) {
                    customAlertDialog.setBackground(i);
                }
                customAlertDialog.setIcon(this.icon);
                customAlertDialog.setTitle(this.title);
                customAlertDialog.setMessage(this.message);
                customAlertDialog.setView(this.view);
                customAlertDialog.setCancelable(this.cancelable);
                customAlertDialog.setOnCancelListener(this.onCancelListener);
                CharSequence charSequence = this.positiveButtonText;
                if (charSequence != null) {
                    customAlertDialog.setPositiveButton(charSequence, this.positiveButtonListener);
                }
                CharSequence charSequence2 = this.negativeButtonText;
                if (charSequence2 != null) {
                    customAlertDialog.setNegativeButton(charSequence2, this.negativeButtonListener);
                }
                CharSequence charSequence3 = this.neutralButtonText;
                if (charSequence3 != null) {
                    customAlertDialog.setNeutralButton(charSequence3, this.neutralButtonListener);
                }
                if (this.items != null) {
                    createListView(customAlertDialog);
                }
            }
        }

        public Builder(Context context) {
            this.context = context;
            this.p = new Params(context);
        }

        public CustomAlertDialog create() {
            CustomAlertDialog customAlertDialog = new CustomAlertDialog(this.context);
            this.p.apply(customAlertDialog);
            return customAlertDialog;
        }

        public Builder setBackground(int i) {
            this.p.backgroundId = i;
            return this;
        }

        public Builder setCancelable(boolean z) {
            this.p.cancelable = z;
            return this;
        }

        public Builder setIcon(int i) {
            return setIcon(gr0.a(this.context, i));
        }

        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            Params params = this.p;
            params.items = charSequenceArr;
            params.onClickListener = onClickListener;
            return this;
        }

        public Builder setMessage(int i) {
            return setMessage(sn5.b(this.context, i, new Object[0]));
        }

        public Builder setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            return setNegativeButton(sn5.b(this.context, i, new Object[0]), onClickListener);
        }

        public Builder setNeutralButton(int i, DialogInterface.OnClickListener onClickListener) {
            return setNeutralButton(sn5.b(this.context, i, new Object[0]), onClickListener);
        }

        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.p.onCancelListener = onCancelListener;
            return this;
        }

        public Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.p.onKeyListener = onKeyListener;
            return this;
        }

        public Builder setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            return setPositiveButton(sn5.b(this.context, i, new Object[0]), onClickListener);
        }

        public Builder setTitle(int i) {
            return setTitle(sn5.b(this.context, i, new Object[0]));
        }

        public Builder setView(View view) {
            this.p.view = view;
            return this;
        }

        public Builder setIcon(Drawable drawable) {
            this.p.icon = drawable;
            return this;
        }

        public Builder setMessage(CharSequence charSequence) {
            this.p.message = charSequence;
            return this;
        }

        public Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            Params params = this.p;
            params.negativeButtonText = charSequence;
            params.negativeButtonListener = onClickListener;
            return this;
        }

        public Builder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            Params params = this.p;
            params.neutralButtonText = charSequence;
            params.neutralButtonListener = onClickListener;
            return this;
        }

        public Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            Params params = this.p;
            params.positiveButtonText = charSequence;
            params.positiveButtonListener = onClickListener;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            this.p.title = charSequence;
            return this;
        }
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.title = charSequence;
    }

    public CustomAlertDialog(Context context, int i) {
        super(context, i);
        this.backgroundId = -1;
        this.gravity = 17;
        init();
    }

    public CustomAlertDialog(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.backgroundId = -1;
        this.gravity = 17;
        init();
    }
}
