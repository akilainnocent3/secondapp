package com.sportybet.plugin.webcontainer.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public class AlertDialogViewBuilder {
    LinearLayout buttonPanel;
    LinearLayout contentPanel;
    Context context;
    FrameLayout customPanel;
    View rootView;
    LinearLayout titlePanel;

    public AlertDialogViewBuilder(Context context) {
        this.context = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.web_alert_dialog, (ViewGroup) null);
        this.rootView = viewInflate;
        this.titlePanel = (LinearLayout) viewInflate.findViewById(R.id.title_panel);
        this.contentPanel = (LinearLayout) this.rootView.findViewById(R.id.contentPanel);
        this.buttonPanel = (LinearLayout) this.rootView.findViewById(R.id.buttonPanel);
        this.customPanel = (FrameLayout) this.rootView.findViewById(R.id.customPanel);
    }

    public View getView() {
        return this.rootView;
    }

    public AlertDialogViewBuilder setMessage(String str) {
        if (str != null) {
            ((TextView) this.contentPanel.findViewById(R.id.message)).setText(str);
            this.contentPanel.setVisibility(0);
        }
        return this;
    }

    public AlertDialogViewBuilder setNegativeButton(String str, View.OnClickListener onClickListener) {
        if (str != null) {
            Button button = (Button) this.buttonPanel.findViewById(R.id.negativeButton);
            button.setText(str);
            button.setOnClickListener(onClickListener);
            button.setVisibility(0);
            this.buttonPanel.setVisibility(0);
        }
        return this;
    }

    public AlertDialogViewBuilder setNeutralButton(String str, View.OnClickListener onClickListener) {
        if (str != null) {
            Button button = (Button) this.buttonPanel.findViewById(R.id.neutralButton);
            button.setText(str);
            button.setOnClickListener(onClickListener);
            button.setVisibility(0);
            this.buttonPanel.setVisibility(0);
        }
        return this;
    }

    public AlertDialogViewBuilder setPositiveButton(String str, View.OnClickListener onClickListener) {
        if (str != null) {
            Button button = (Button) this.buttonPanel.findViewById(R.id.positiveButton);
            button.setText(str);
            button.setOnClickListener(onClickListener);
            button.setVisibility(0);
            this.buttonPanel.setVisibility(0);
        }
        return this;
    }

    public AlertDialogViewBuilder setTitle(String str) {
        if (str != null) {
            ((TextView) this.titlePanel.findViewById(R.id.title)).setText(str);
            this.titlePanel.setVisibility(0);
        }
        return this;
    }
}
