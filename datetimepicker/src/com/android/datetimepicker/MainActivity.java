package com.android.datetimepicker;

import java.io.FileDescriptor;
import java.io.PrintWriter;

import com.android.datetimepicker.time.TimePickerDialog;
import com.ex.datetimepicker.R;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Fragment.SavedState;
import android.app.FragmentManager.BackStackEntry;
import android.app.FragmentManager.OnBackStackChangedListener;
import android.view.Menu;

@SuppressLint("NewApi")
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		TimePickerDialog dia=new TimePickerDialog();
		FragmentManager dd=new FragmentManager() {
			
			@Override
			public SavedState saveFragmentInstanceState(Fragment arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void removeOnBackStackChangedListener(OnBackStackChangedListener arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void putFragment(Bundle arg0, String arg1, Fragment arg2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean popBackStackImmediate(int arg0, int arg1) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean popBackStackImmediate(String arg0, int arg1) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean popBackStackImmediate() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void popBackStack(int arg0, int arg1) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void popBackStack(String arg0, int arg1) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void popBackStack() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean isDestroyed() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Fragment getFragment(Bundle arg0, String arg1) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getBackStackEntryCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public BackStackEntry getBackStackEntryAt(int arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Fragment findFragmentByTag(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Fragment findFragmentById(int arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean executePendingTransactions() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void dump(String arg0, FileDescriptor arg1, PrintWriter arg2,
					String[] arg3) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public FragmentTransaction beginTransaction() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void addOnBackStackChangedListener(OnBackStackChangedListener arg0) {
				// TODO Auto-generated method stub
				
			}
		};
		dia.show(dd, "aa");
	}

	

}
