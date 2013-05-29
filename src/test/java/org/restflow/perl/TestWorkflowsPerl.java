package org.restflow.perl;

import org.restflow.test.WorkflowTestCase;

public class TestWorkflowsPerl extends WorkflowTestCase {

	public TestWorkflowsPerl() {
		super("workflows");
	}

	@Override
	public void setUp() throws Exception {
		super.setUp();
		_importSchemeToResourceMap.put("actors", "classpath:/org/restflow/perl/");
	}

	public void test_HelloWorld_PerlActor_DataDrivenDirector() throws Exception {
		_loadAndRunWorkflow("HelloWorld", _dataDrivenDirector());
		assertEquals(_getExpectedTrace(), _runner.getTraceReport());
		assertEquals(_getExpectedStdout(), _runner.getStdoutRecording());		
	}

	public void test_BranchingWorkflow_PerlActor_DataDrivenDirector() throws Exception {
		_loadAndRunWorkflow("BranchingWorkflow", _dataDrivenDirector());
		assertEquals(_getExpectedTrace(), _runner.getTraceReport());
		assertEquals(_getExpectedStdout("stdout_data.txt"), _runner.getStdoutRecording());		
	}
	
	public void test_MergingWorkflow_PerlActor_DataDrivenDirector() throws Exception {
		_loadAndRunWorkflow("MergingWorkflow", _dataDrivenDirector());
		assertEquals(_getExpectedTrace(), _runner.getTraceReport());		
		assertEquals(_getExpectedStdout(), _runner.getStdoutRecording());		
	}
	
	public void test_CountToThree_PerlActor_DataDrivenDirector() throws Exception {
		_loadAndRunWorkflow("CountToThree", _dataDrivenDirector());
		assertEquals(_getExpectedTrace(), _runner.getTraceReport());
		assertEquals(_getExpectedStdout(), _runner.getStdoutRecording());
	}

	public void test_IntegerFilter_PerlhActor_DataDrivenDirector() throws Exception {
		_loadAndRunWorkflow("IntegerFilter", _dataDrivenDirector());
		assertEquals(_getExpectedTrace(), _runner.getTraceReport());		
		assertEquals(_getExpectedStdout(), _runner.getStdoutRecording());
	}	
	
	public void test_AdderLoop_PerlActor_DataDrivenDirector() throws Exception {
		_loadAndRunWorkflow("AdderLoop", _dataDrivenDirector());
		assertEquals(_getExpectedTrace(), _runner.getTraceReport());		
		assertEquals(_getExpectedStdout(), _runner.getStdoutRecording());
	}		
	
	public void test_IntegerStreamMergeDuplicates_PerlActor_DataDrivenDirector() throws Exception {
		_loadAndRunWorkflow("IntegerStreamMergeDuplicates", _dataDrivenDirector());
		assertEquals(_getExpectedTrace(), _runner.getTraceReport());
		assertEquals(_getExpectedStdout("stdout_data.txt"), _runner.getStdoutRecording());
		System.out.println(_runner.getStderrRecording());
	}	
	
	public void test_HammingSequence_PerlActor_DataDrivenDirector() throws Exception {
		_loadAndRunWorkflow("HammingSequence", _dataDrivenDirector());
		assertEquals(_getExpectedTrace(), _runner.getTraceReport());
		assertEquals(_getExpectedStdout("stdout.txt"), _runner.getStdoutRecording());
	}	
}
