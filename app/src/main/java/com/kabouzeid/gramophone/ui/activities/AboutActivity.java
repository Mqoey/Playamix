package com.kabouzeid.gramophone.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;

import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.afollestad.materialdialogs.internal.ThemeSingleton;
import com.kabouzeid.appthemehelper.ThemeStore;
import com.kabouzeid.gramophone.App;
import com.kabouzeid.gramophone.R;
import com.kabouzeid.gramophone.dialogs.ChangelogDialog;
import com.kabouzeid.gramophone.dialogs.DonationsDialog;
import com.kabouzeid.gramophone.ui.activities.base.AbsBaseActivity;
import com.kabouzeid.gramophone.ui.activities.bugreport.BugReportActivity;
import com.kabouzeid.gramophone.ui.activities.intro.AppIntroActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.psdev.licensesdialog.LicensesDialog;

/**
 * @author Karim Abou Zeid (kabouzeid)
 */
@SuppressWarnings("FieldCanBeLocal")
public class AboutActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
}
