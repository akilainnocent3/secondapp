package com.sportybet.plugin.webcontainer.caipiao.jsplugin;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity;
import com.sportybet.plugin.webcontainer.jsbridge.JsBridgeParams;
import com.sportybet.plugin.webcontainer.jsbridge.LDJSCallbackContext;
import com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin;
import com.sportybet.plugin.webcontainer.jsbridge.service.JSPluginService;
import com.sportybet.plugin.webcontainer.type.Menu;
import defpackage.gr0;
import defpackage.tug;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class JSPluginWebViewTitleControl extends LDJSPlugin {
    private static final String PLUGIN_NAME = "ui";
    private static final String SET_LEFT_CLOSE_BAR_ITEM_WITH_JS = "setLeftCloseBarItemWithJS";
    private static final String SET_OPTION_MENU = "setOptionMenu";
    private static final String SET_TOOLBAR_MENU = "setToolbarMenu";
    private final Context context;

    public JSPluginWebViewTitleControl(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeCallBack(String str) {
        if (this.webView != null) {
            this.webView.loadUrl(tug.a("javascript:mapp.disPatchEvent('", str, "');"));
        }
    }

    private void setHoldCloseAction(Activity activity) {
        activity.findViewById(R.id.tv_close).setOnClickListener(new View.OnClickListener() { // from class: com.sportybet.plugin.webcontainer.caipiao.jsplugin.JSPluginWebViewTitleControl.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                JSPluginWebViewTitleControl.this.executeCallBack("closeWithJS");
            }
        });
        if (BaseWebViewActivity.class.isAssignableFrom(activity.getClass())) {
            ((BaseWebViewActivity) activity).holdCloseTitle();
        }
    }

    private void setMenuBt(Button button, final ArrayList<Menu> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            ((ViewGroup) button.getParent()).findViewById(R.id.menu_arrow_up).setVisibility(8);
            button.setVisibility(8);
        } else {
            button.setText("");
            button.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.web_menu_icon, 0);
            button.setVisibility(0);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.sportybet.plugin.webcontainer.caipiao.jsplugin.JSPluginWebViewTitleControl.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    JSPluginWebViewTitleControl.this.showMenuListPopup(arrayList);
                }
            });
        }
    }

    private void setRightBt(String str, String str2, Button button) {
        Drawable drawableA;
        try {
            drawableA = gr0.a(this.context, this.context.getResources().getIdentifier(str2, "drawable", this.context.getPackageName()));
            try {
                drawableA.setBounds(0, 0, drawableA.getMinimumWidth(), drawableA.getMinimumHeight());
            } catch (Resources.NotFoundException unused) {
            }
        } catch (Resources.NotFoundException unused2) {
            drawableA = null;
        }
        if (drawableA != null) {
            button.setText("");
            button.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            button.setCompoundDrawables(drawableA, null, null, null);
            button.setVisibility(0);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.sportybet.plugin.webcontainer.caipiao.jsplugin.JSPluginWebViewTitleControl.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    JSPluginWebViewTitleControl.this.executeCallBack("optionMenu");
                }
            });
            return;
        }
        if (TextUtils.isEmpty(str)) {
            ((ViewGroup) button.getParent()).findViewById(R.id.menu_arrow_up).setVisibility(8);
            button.setVisibility(8);
        } else {
            button.setText(str);
            button.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            button.setVisibility(0);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.sportybet.plugin.webcontainer.caipiao.jsplugin.JSPluginWebViewTitleControl.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    JSPluginWebViewTitleControl.this.executeCallBack("optionMenu");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showMenuListPopup(ArrayList<Menu> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        final PopupWindow popupWindow = new PopupWindow(this.webView.getContext());
        final LinearLayout linearLayout = (LinearLayout) View.inflate(this.webView.getContext(), R.layout.web_menu_list_view, null);
        popupWindow.setContentView(linearLayout);
        popupWindow.setOutsideTouchable(false);
        popupWindow.setHeight(-2);
        popupWindow.setWidth(-2);
        popupWindow.setBackgroundDrawable(gr0.a(this.webView.getContext(), R.drawable.transparent));
        popupWindow.setTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.sportybet.plugin.webcontainer.caipiao.jsplugin.JSPluginWebViewTitleControl.5
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ((Activity) JSPluginWebViewTitleControl.this.webView.getContext()).findViewById(R.id.menu_arrow_up).setVisibility(8);
            }
        });
        for (int i = 0; i < arrayList.size(); i++) {
            Menu menu = arrayList.get(i);
            View viewInflate = View.inflate(this.webView.getContext(), R.layout.web_menu_item, null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.menu_tv);
            textView.setText(menu.getName());
            textView.setTag(menu.getTag());
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.sportybet.plugin.webcontainer.caipiao.jsplugin.JSPluginWebViewTitleControl.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    JSPluginWebViewTitleControl.this.executeCallBack((String) view.getTag());
                    PopupWindow popupWindow2 = popupWindow;
                    if (popupWindow2 != null) {
                        popupWindow2.dismiss();
                    }
                }
            });
            if (i == arrayList.size() - 1) {
                viewInflate.findViewById(R.id.split_line).setVisibility(8);
            } else {
                viewInflate.findViewById(R.id.split_line).setVisibility(0);
            }
            linearLayout.addView(viewInflate);
        }
        Activity activity = (Activity) this.webView.getContext();
        linearLayout.setVisibility(4);
        popupWindow.showAsDropDown(activity.findViewById(R.id.btn_right), 0, 0);
        ((Activity) this.webView.getContext()).findViewById(R.id.menu_arrow_up).setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(150L);
        translateAnimation.setStartOffset(300L);
        ((Activity) this.webView.getContext()).findViewById(R.id.menu_arrow_up).startAnimation(translateAnimation);
        new Handler().postDelayed(new Runnable() { // from class: com.sportybet.plugin.webcontainer.caipiao.jsplugin.JSPluginWebViewTitleControl.7
            @Override // java.lang.Runnable
            public void run() {
                TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, -linearLayout.getHeight(), 0.0f);
                translateAnimation2.setDuration(300L);
                linearLayout.setVisibility(0);
                linearLayout.startAnimation(translateAnimation2);
            }
        }, 1L);
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public void addMappings(JSPluginService jSPluginService) {
        jSPluginService.addJsMapping(PLUGIN_NAME, SET_OPTION_MENU, "AFJsApi.ui.setOptionMenu", true, true);
        jSPluginService.addJsMapping(PLUGIN_NAME, SET_TOOLBAR_MENU, "AFJsApi.ui.setToolbarMenu", true, true);
        jSPluginService.addJsMapping(PLUGIN_NAME, SET_LEFT_CLOSE_BAR_ITEM_WITH_JS, "AFJsApi.ui.setLeftCloseBarItemWithJS", false, false);
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public boolean execute(String str, JsBridgeParams jsBridgeParams, LDJSCallbackContext lDJSCallbackContext) throws JSONException {
        WebView webView;
        if (SET_OPTION_MENU.equals(str)) {
            WebView webView2 = this.webView;
            if (webView2 != null && (webView2.getContext() instanceof Activity)) {
                setRightBt((String) jsBridgeParams.getParam("title"), (String) jsBridgeParams.getParam("resId"), (Button) ((Activity) this.webView.getContext()).findViewById(R.id.btn_right));
                return true;
            }
        } else {
            if (SET_TOOLBAR_MENU.equals(str)) {
                WebView webView3 = this.webView;
                if (webView3 != null && (webView3.getContext() instanceof Activity)) {
                    JSONArray jSONArray = (JSONArray) jsBridgeParams.getParam("menus");
                    ArrayList<Menu> arrayList = new ArrayList<>();
                    if (jSONArray != null && jSONArray.length() > 0) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            Menu menu = new Menu();
                            menu.setName(jSONObject.getString("name"));
                            menu.setTag(jSONObject.getString("tag"));
                            arrayList.add(menu);
                        }
                    }
                    if (arrayList.size() > 0) {
                        setMenuBt((Button) ((Activity) this.webView.getContext()).findViewById(R.id.btn_right), arrayList);
                    }
                }
                return true;
            }
            if (SET_LEFT_CLOSE_BAR_ITEM_WITH_JS.equals(str) && (webView = this.webView) != null && (webView.getContext() instanceof Activity)) {
                setHoldCloseAction((Activity) this.webView.getContext());
                return true;
            }
        }
        return super.execute(str, jsBridgeParams, lDJSCallbackContext);
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public String getName() {
        return PLUGIN_NAME;
    }
}
